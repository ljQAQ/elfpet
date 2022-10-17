package com.elf.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AclRolePermissionMapper {

    @Select("select permission_id from acl_role_permission where role_id = #{id}")
    List<String> getPermissionIdByRoleId(String id);
}
