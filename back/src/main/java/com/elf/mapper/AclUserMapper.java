package com.elf.mapper;


import com.elf.domain.AclRole;
import com.elf.domain.AclUser;
import com.elf.dto.AclUserDto;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AclUserMapper {

    List<AclUserDto> selectAll();

    @Select("select * from acl_user where id = #{id}")
    AclUser selectById(String id);

    Integer insertAclUser(AclUser aclUser);

    Integer updateAclUser(AclUser aclUser);

    @Update("update acl_user set is_delete = 1 where id = #{id}")
    Integer deleteById(String id);
}
