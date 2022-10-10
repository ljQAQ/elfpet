package com.elf.service.impl;

import com.elf.commonutils.Result;
import com.elf.mapper.BIZMapper;
import com.elf.service.BIZService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BIZServiceImpl implements BIZService {

    @Autowired
    BIZMapper bizMapper;

    @Override
    public Result getAll() {
        return Result.ok().data("bizOptions",bizMapper.getAll());
    }
}
