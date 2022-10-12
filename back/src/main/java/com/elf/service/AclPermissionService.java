package com.elf.service;

import com.elf.commonutils.Result;
import com.elf.domain.AclPermission;

public interface AclPermissionService {

    public Result getTreeList();

    public Result createOrUpdate(AclPermission aclPermission);
}