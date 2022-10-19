package com.elf.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AclRole {
    private String id;
    private String roleName;
    private String roleCode;
    private String remark;
    private Integer isDeleted;
    private Date gmtCreate;
    private Date gmtModified;

    private List<AclPermission> permissionList;

}
