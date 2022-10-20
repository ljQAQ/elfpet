package com.elf.service;

import com.elf.commonutils.Result;
import com.elf.domain.AclUser;
import com.elf.dto.AclUserDto;

import javax.servlet.http.HttpServletRequest;

public interface AclUserService {
    Result getPageList(Integer pageNum, Integer pageSize);

    Result login(AclUser aclUser, HttpServletRequest request);

    Result createOrUpdate(AclUserDto aclUserDto);

    Result getPermissionByUserId(String userId);
}
