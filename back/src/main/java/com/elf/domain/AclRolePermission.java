package com.elf.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AclRolePermission {
    private String id;
    private String roleId;
    private String permissionId;
    private String isDeleted;
    private String gmtCreate;
    private String gmtModified;
}
