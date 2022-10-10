package com.elf.mapper;

import com.elf.domain.BIZ;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface BIZMapper {

    @Select("select * from biz where id = #{arg0}")
    BIZ getById(Long id);
}
