package com.elf.domain;

import com.elf.dto.AclPermissionDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AclPermission {

    private String id;
    private String pid;
    private String name;
    private Integer type;
    private String permissionValue;
    private String path;
    private String component;
    private String icon;
    private Integer status = 1;
    private Integer  isDeleted = 0;
    private Date gmtCreate;
    private Date gmtModified;

    private List<AclPermissionDto> children;
}
