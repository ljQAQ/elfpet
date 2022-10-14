package com.elf.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AclPermissionDto {
    private String id;
    private String label;
    private Integer type;
    private String permissionValue;
    private String path;
    private String component;
    private String icon;
    private Integer status;
    private Integer  isDeleted;
    private Date gmtCreate;
    private Date gmtModified;
    private String pid;
    private List<AclPermissionDto> children;
}
