package com.elf.mapper;

import com.elf.domain.GType;
import com.elf.dto.GTypeDto;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GTypeMapper {

    @Select("select * from gtype where id = #{arg0}")
    GType getById(Long id);

    List<GTypeDto> getChild(Integer id);

    List<GTypeDto> getAll();
}
