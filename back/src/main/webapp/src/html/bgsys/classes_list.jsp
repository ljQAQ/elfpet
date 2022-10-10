<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Document</title>
    <link rel="stylesheet" href="../../../assets/css/elementui/theme/index.css"/>

</head>
<body style="margin: 2px;height: 520px">
<div id="tb">
    <el-row>
        <el-col :span="3">
            <div class="grid-content bg-purple">
                <el-button type="primary" icon="el-icon-circle-plus" @click="dialogFormVisible = true">添加</el-button>
            </div>
        </el-col>
        <el-col :span="3">
            <div class="grid-content bg-purple">
                <el-button type="primary" icon="el-icon-delete">批量删除</el-button>
            </div>
        </el-col>
        <el-col :span="6">
            <div class="demo-input-suffix">
                <el-input
                        placeholder="请输入内容"
                        v-model="key">
                </el-input>
            </div>
        </el-col>
        <el-button type="primary" icon="el-icon-search" @click="getData">查询</el-button>
    </el-row>
    <el-table :data="tableData" style="width: 100%">
        <el-table-column
                type="selection"
                width="55">
        </el-table-column>
        <el-table-column label="ID" width="180">
            <template slot-scope="scope">
                <span style="margin-left: 10px">{{ scope.row.id }}</span>
            </template>
        </el-table-column>
        <el-table-column label="班级名" width="180">
            <template slot-scope="scope">
                <span style="margin-left: 10px">{{ scope.row.classes_name }}</span>
            </template>
        </el-table-column>
        <el-table-column label="课程ID" width="180">
            <template slot-scope="scope">
                <span style="margin-left: 10px">{{ scope.row.college_id }}</span>
            </template>
        </el-table-column>
        <el-table-column fixed="right" label="操作">
            <template slot-scope="scope">
                <el-button
                        size="mini"
                        type="primary"
                        icon="el-icon-edit"
                        @click="handleEdit(scope.row)"
                >编辑
                </el-button>
                <el-popconfirm
                        confirm-button-text='确认删除'
                        @confirm="handleDelete(scope.row)"
                        cancel-button-text='取消'
                        icon="el-icon-info"
                        icon-color="red"
                        title="这是一段内容确定删除吗？"
                >
                    <el-button
                            size="mini"
                            type="danger"
                            slot="reference"
                            icon="el-icon-delete"
                    >删除
                    </el-button>
                </el-popconfirm>

            </template>
        </el-table-column>
    </el-table>
    <el-pagination
            background
            layout="prev, pager, next"
            :page-size="pageSize"
            :total="totalNums"
            :current-page="currentPage"
            @current-change="changepage"
    >
    </el-pagination>

    <el-dialog :title="dialogTitle" :visible.sync="dialogFormVisible">
        <el-form :model="classes">
            <el-form-item label="班级名" :label-width="formLabelWidth">
                <el-input v-model="classes.classes_name" autocomplete="off"></el-input>
            </el-form-item>
            <el-form-item label="课程ID" :label-width="formLabelWidth">
                <el-input v-model="classes.college_id" autocomplete="off"></el-input>
            </el-form-item>
        </el-form>
        <div slot="footer" class="dialog-footer">
            <el-button @click="dialogFormVisible = false">取 消</el-button>
            <el-button type="primary" @click="saveOrCreate">确 定</el-button>
        </div>
    </el-dialog>
</div>

</body>
<script src="../../../assets/js/vue.js"></script>
<!-- 引入组件库 -->
<%--<script src="https://unpkg.com/element-ui/lib/index.js"></script>--%>
<script src="../../../assets/css/elementui/elementui.js"></script>
<script src="../../../assets/js/axios.js"></script>
<script>
    var classes = {
        id: null,
        classes_name: '',
        college_id: '',
    }
    var data = {
        tableData: [],
        totalNums: 0,
        pageSize: 3,
        currentPage: 1,
        key: '',
        dialogFormVisible: false,
        dialogTitle: '',
        classes: classes,
        formLabelWidth: '120px'

    }
    var app = new Vue({
        el: "#tb",
        data: data,
        created() {
            this.getData();
        },
        methods: {
            getData() {
                axios.get('http://localhost:8888/classes', {
                    params: {
                        'pageSize': this.pageSize,
                        'currentPage': this.currentPage,
                        'key': this.key,
                    }
                }).then((res) => {
                    var data = res.data;
                    if (data.code == "20000") {
                        console.log(res)
                        var pageUtils = data.data.pageUtils;
                        this.tableData = pageUtils.list;
                        this.totalNums = pageUtils.totalNums;
                        this.pageSize = pageUtils.pageSize;
                        this.currentPage = pageUtils.currentPage;
                    } else {
                        this.changepage(this.currentPage - 1)
                    }
                })

            },
            changepage(currentPage) {
                this.currentPage = currentPage;
                this.getData();
            },
            handleEdit(row) {
                classes.id = row.id
                classes.classes_name = row.classes_name
                classes.college_id = row.college_id
                this.dialogTitle = '编辑';
                this.dialogFormVisible = true
            },
            handleAdd() {
                classes.id = null
                classes.classes_name = ''
                classes.college_id = null
                this.dialogTitle = '添加';
                this.dialogFormVisible = true
            },
            saveOrCreate() {
                axios.get('http://localhost:8888/classes', {
                    params: {
                        'method': 'saveOrCreate',
                        'id': classes.id,
                        'classes_name': classes.classes_name,
                        'college_id': classes.college_id,
                    }
                }).then((res) => {
                    var data = res.data;
                    if (data.code == "20000") {
                        this.$message({
                            message: data.message,
                            type: 'success'
                        });
                    } else {
                        this.$message.error(data.message);
                    }
                    this.dialogFormVisible = false
                    this.getData();
                })
            },
            handleDelete(row) {
                axios.get('http://localhost:8888/classes', {
                    params: {
                        'method': 'delete',
                        'id': row.id,
                    }
                }).then((res) => {
                    var data = res.data;
                    if (data.code == "20000") {
                        this.$message({
                            message: data.message,
                            type: 'success'
                        });
                    } else {
                        this.$message.error(data.message);
                    }
                    this.getData();
                })
            },
        },
    });
</script>
</html>
