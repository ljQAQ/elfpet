package com.elf.test;

import com.elf.mapper.AclPermissionMapper;
import com.elf.service.AclRoleService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AclRoleTest {

    private static AclRoleService aclRoleService;
    static {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        aclRoleService = context.getBean(AclRoleService.class);
    }

    @Test
    public void getPageList(){
        aclRoleService.gettPageList(1,1);
    }
}
