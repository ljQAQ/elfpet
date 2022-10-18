package com.elf.controller;




import com.elf.domain.Comment;
import com.elf.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.transform.Result;

public class CommentController {

    @Autowired
    private CommentService commentService;


    @PostMapping("/check")
    public Result check(Integer pageNum,@RequestParam(required = false,defaultValue = "3")Integer pageSize){
        return (Result) commentService.check();
    }


    @PostMapping("/findOne")
        public Result findOne(Integer id){
            return (Result) commentService.findOne(id);

    }


    @PostMapping("/addOne")
    public Integer addOne(Comment comment){
        return commentService.addOne(comment);
    }


   @PostMapping("/delete")
    public Integer delete(Comment comment){
        return commentService.delete(comment);
    }


    @PostMapping("/update")
    public  Integer update(Comment comment){

        return commentService.update(comment);
    }


}
