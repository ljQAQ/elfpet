package com.elf.mapper;

import com.elf.domain.AclRole;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AclRoleMapper {


    @Select("select * from acl_role")
    List<AclRole> selectAll();

    @Select("select * from acl_role where id = #{id}")
    AclRole selectById(String id);

    Integer insertAclRole(AclRole aclRole);

    Integer updateAclRole(AclRole aclRole);

    @Update("update acl_role set is_delete = 1 where id = #{id}")
    Integer deleteById(String id);
}
