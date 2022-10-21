package com.elf.service.impl;

import com.elf.commonutils.Result;
import com.elf.domain.BIZ;
import com.elf.mapper.BIZMapper;
import com.elf.service.BIZService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class BIZServiceImpl implements BIZService {

    @Autowired
    BIZMapper bizMapper;

    @Override
    public Result getAll() {
        return Result.ok().data("bizs",bizMapper.getAll());
    }


    @Override
    public Result addBIZ(BIZ biz) {
        if (bizMapper.getByBizName(biz.getBizName())!=0){
            return Result.error().message("商家已存在").code(-1);
        }
        int i = bizMapper.addOneBIZ(biz);
        if (i==0){
            return Result.error().code(-1);
        }
        return Result.ok();
    }

    @Override
    public Result deleteOneBIZ(Long id) {
        if (id<=0){
            return Result.error().message("id不合法");
        }
        int i = bizMapper.deleteOne(id);
        if (i==0){
            return Result.error().message("添加失败");
        }
        return Result.ok();
    }

    @Override
    public Result deleteMany(String ids) {
        if (ids==null){
            return Result.error().message("请选择数据").code(-1);
        }
        int i = bizMapper.deleteMany(ids);
        if (i==0){
            return Result.error().message("删除失败").code(-1);
        }
        return Result.ok();
    }

    @Override
    public Result updateBIZ(BIZ biz) {

        if (bizMapper.getByBizName(biz.getBizName())==1){
            return Result.error().message("商家已存在").code(-1);
        }
        int i = bizMapper.updateOne(biz);
        if (i==0){
            return Result.error().code(-1);
        }
        return Result.ok();
    }


    @Override
    public Result getBIZByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<BIZ> all = bizMapper.getAll();
        PageInfo<BIZ> pageInfo = new PageInfo<>(all);

        return Result.ok().data("pageInfo",pageInfo);
    }

    @Override
    public Result searchBIZs(String bizName,Integer pageNo,Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);

        List<BIZ> searchBIZs = bizMapper.searchBIZs(bizName);
        PageInfo<BIZ> pageInfo = new PageInfo<>(searchBIZs);
        return Result.ok().data("pageInfo",pageInfo);
    }


}
