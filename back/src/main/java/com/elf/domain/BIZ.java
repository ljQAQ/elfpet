package com.elf.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BIZ {
    private Integer id;
    private String  bizName;
    private String bizSite;
    private Date createTime;
}
