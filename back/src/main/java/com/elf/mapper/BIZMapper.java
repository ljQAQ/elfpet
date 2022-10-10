package com.elf.mapper;

import com.elf.domain.BIZ;
import com.elf.domain.GType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BIZMapper {

    @Select("select * from biz where id = #{arg0}")
    BIZ getById(Long id);

    @Select("select * from biz")
    List<BIZ> getAll();
}
