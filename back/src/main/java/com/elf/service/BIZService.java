package com.elf.service;

import com.elf.commonutils.Result;
import com.elf.domain.BIZ;

import java.util.List;

public interface BIZService {

    Result getAll();

    Result addBIZ(BIZ biz);

    Result deleteOneBIZ(Long id);

    Result deleteMany(String ids);

    Result updateBIZ(BIZ biz);

    Result getBIZByPage(int pageNum,int pageSize);


}
