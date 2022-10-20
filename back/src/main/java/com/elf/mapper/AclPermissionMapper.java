package com.elf.mapper;

import com.elf.domain.AclPermission;
import com.elf.domain.GType;
import com.elf.dto.AclPermissionDto;
import com.elf.dto.GTypeDto;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AclPermissionMapper {

    @Select("select * from acl_permission where id = #{arg0}")
    AclPermission getById(Long id);

    List<AclPermissionDto> getChild(Integer id);

    List<AclPermissionDto> getTreeList(String pid);

    Integer addPermission(AclPermission aclPermission);

    Integer updateById(AclPermission aclPermission);

    List<AclPermissionDto> getPermissionListByRoleId(String roleId);
}
