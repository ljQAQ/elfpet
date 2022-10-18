package com.elf.service;

import com.elf.commonutils.Result;

import java.util.List;

public interface AclRolePermissionService {

    Result getPermissionIdByRoleId(String id);

    Result setRolePermission(List<String> permissionIds, String roleId);
}

