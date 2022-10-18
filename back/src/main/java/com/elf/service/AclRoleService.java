package com.elf.service;

import com.elf.commonutils.Result;
import com.elf.domain.AclRole;

public interface AclRoleService {


    Result getPageList(Integer pageNum, Integer pageSize);

    Result createOrUpdate(AclRole aclRole);
}
