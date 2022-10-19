package com.elf.dto;

import com.elf.domain.AclPermission;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AclRoleDto {

    private String id;
    private List<String> permissionIds;

}
