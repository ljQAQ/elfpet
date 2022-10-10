package com.elf.service.impl;

import com.elf.commonutils.Result;
import com.elf.domain.GType;
import com.elf.mapper.GTypeMapper;
import com.elf.service.GTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class GTypeServiceImpl implements GTypeService {

    @Autowired
    GTypeMapper gTypeMapper;

    @Override
    public Result getTreeList() {
        return Result.ok().data("gtypeOptions", gTypeMapper.getAll());
    }
}
