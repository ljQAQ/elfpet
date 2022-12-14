package com.elf.mapper;

import com.elf.domain.AclRolePermission;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AclRolePermissionMapper {

    List<String> getPermissionIdByRoleId(String id);

    Integer saveRolePermission(List<AclRolePermission> list);

    Integer deleteRolePermission(@Param("roleId")String roleId,@Param("permissionId")String permissionId);
}
