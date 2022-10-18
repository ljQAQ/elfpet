package com.elf.mapper;


import com.elf.domain.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface CommentMapper {

    Comment findOne(@Param("id")Integer id);



    Integer  addOne(@Param("name")Comment comment);
    Integer  delete(@Param("name")Comment comment);
    Integer  update(@Param("name")Comment comment);


    List<Comment> check();


}
