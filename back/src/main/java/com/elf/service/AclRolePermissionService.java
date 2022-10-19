package com.elf.service;

import com.elf.commonutils.Result;
import com.elf.dto.AclRoleDto;

import java.util.List;

public interface AclRolePermissionService {

    Result getPermissionIdByRoleId(String id);

    Result setRolePermission(AclRoleDto aclRoleDto);
}

