package com.elf.mapper;

import com.elf.domain.GType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface GTypeMapper {

    @Select("select * from gtype where id = #{arg0}")
    GType getById(Long id);
}
