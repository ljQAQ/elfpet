package com.elf.service;

import com.elf.commonutils.Result;
import com.elf.domain.User;

public interface UserService {

    Result login(User user);

    Result register(User user);

    Result getUserPage(Integer pageNum, Integer pageSize, String key);
}
