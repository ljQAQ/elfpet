package com.elf.service.impl;



import com.elf.domain.Comment;
import com.elf.mapper.CommentMapper;
import com.elf.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;

    @Override
    public Comment findOne(Integer id) {
        return commentMapper.findOne(id);
    }

    @Override
    public Integer addOne(Comment comment) {
        return commentMapper.addOne(comment) ;
    }

    @Override
    public Integer delete(Comment comment) {
        return commentMapper.delete(comment) ;
    }

    @Override
    public Integer update(Comment comment) {
        return  commentMapper.delete(comment);
    }

    @Override
    public List<Comment> check() {
        return commentMapper.check();
    }


}
