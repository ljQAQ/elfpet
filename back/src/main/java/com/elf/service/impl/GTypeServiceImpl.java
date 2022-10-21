package com.elf.service.impl;

import com.elf.commonutils.Result;
import com.elf.domain.GType;
import com.elf.dto.GTypeDto;
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
        List<GTypeDto> all = gTypeMapper.getAll();
        for (GTypeDto gTypeDto : all) {
            if (gTypeDto.getChildren().size()==0){
                gTypeDto.setChildren(null);
            }else {
                for (GTypeDto child : gTypeDto.getChildren()) {
                    if (child.getChildren().size()==0){
                        child.setChildren(null);
                    }else {
                        for (GTypeDto childChild : child.getChildren()) {
                            childChild.setChildren(null);
                        }
                    }

                }
            }
        }

        return Result.ok().data("gtypeOptions", all);
    }
}
