package com.elf.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AclRole {
    private String id;
    private String roleName;
    private String roleCode;
    private String remark;
    private String isDeleted;
    private String gmtCreate;
    private String gmtModified;

}
