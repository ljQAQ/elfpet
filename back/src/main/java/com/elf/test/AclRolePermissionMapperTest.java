package com.elf.test;

import com.elf.mapper.AclPermissionMapper;
import com.elf.mapper.AclRolePermissionMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AclRolePermissionMapperTest {

    private static AclRolePermissionMapper aclRolePermissionMapper;
    static {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        aclRolePermissionMapper = context.getBean(AclRolePermissionMapper.class);
    }

    @Test
    public void test1(){
        System.out.println(aclRolePermissionMapper.getPermissionIdByRoleId("1"));
    }
}
