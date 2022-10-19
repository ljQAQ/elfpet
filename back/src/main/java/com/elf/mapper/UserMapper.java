package com.elf.mapper;


import com.elf.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("select * from user where account = #{account}")
    User getByUsername(String account);

    Integer saveUser(User user);

    List<User> getUserList();
}
