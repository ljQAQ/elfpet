package com.elf.test;

import com.elf.mapper.AclUserMapper;
import com.elf.service.AclRoleService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AclUserMapperTest {

    private static AclUserMapper aclUserMapper;
    static {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        aclUserMapper = context.getBean(AclUserMapper.class);
    }

    @Test
    public void get(){
        System.out.println(aclUserMapper.selectAll());
    }

}
