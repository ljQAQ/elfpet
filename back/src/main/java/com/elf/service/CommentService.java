package com.elf.service;




import com.elf.domain.Comment;

import java.util.List;

public interface CommentService {

    Comment findOne(Integer id);


   Integer addOne(Comment comment);

    Integer delete(Comment comment);

    Integer update(Comment comment);





    List<Comment> check();


}
