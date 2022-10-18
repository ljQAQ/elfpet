package com.elf.domain;

import java.util.Date;

public class Comment {
    //id name content createTime deleteTime
    private int id;
    private String name;
    private String content;
    private Date createTime;
    private Date deleteTime;


    public Comment() {
    }

    public Comment(int id, String name, String content, Date createTime, Date deleteTime) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.createTime = createTime;
        this.deleteTime = deleteTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", deleteTime=" + deleteTime +
                '}';
    }
}
