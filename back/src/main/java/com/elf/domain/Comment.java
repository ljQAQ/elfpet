package com.elf.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    //id name content createTime deleteTime
    private int id;
    private String name;
    private String content;
    private Date createTime;
    private Date deleteTime;
}
