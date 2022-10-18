package com.elf.service.impl;






import com.elf.domain.AfterSale;
import com.elf.mapper.AfterMapper;
import com.elf.service.AfterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AfterServiceImpl implements AfterService {
    @Autowired
    AfterMapper afterMapper;

    @Override
    public AfterSale findOne(Integer id) {
        return afterMapper.findOne(id);
    }

    @Override
    public Integer addOne(AfterSale afterSale) {
        return afterMapper.addOne(afterSale) ;
    }

    @Override
    public Integer delete(AfterSale afterSale) {
        return afterMapper.delete(afterSale) ;
    }

    @Override
    public Integer update(AfterSale afterSale) {
        return  afterMapper.delete(afterSale);
    }

    @Override
    public List<AfterSale> check() {
        return afterMapper.check();
    }


}
