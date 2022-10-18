package com.elf.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AclRolePermission {
    private String id;
    private String roleId;
    private String permissionId;
    private Integer isDeleted;
    private Date gmtCreate;
    private Date gmtModified;
}
