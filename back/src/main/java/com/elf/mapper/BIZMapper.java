package com.elf.mapper;

import com.elf.domain.BIZ;
import com.elf.domain.GType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BIZMapper {


    @Select("select * from biz where id = #{arg0}")
    BIZ getById(Long id);

    @Select("select * from biz")
    List<BIZ> getAll();

    @Select("select count(*) from biz where biz_name = #{bizName}")
    int getByBizName(@Param("bizName") String bizName);

    int addOneBIZ(@Param("biz") BIZ biz);

    @Delete("delete from biz where id = #{id}")
    int deleteOne(@Param("id") Long id);


    int deleteMany(@Param("ids") String ids);

    int updateOne(BIZ biz);
}
