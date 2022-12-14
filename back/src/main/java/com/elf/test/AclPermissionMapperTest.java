package com.elf.test;

import com.elf.domain.AclPermission;
import com.elf.mapper.AclPermissionMapper;
import com.elf.mapper.GTypeMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class AclPermissionMapperTest {
    private static AclPermissionMapper aclPermissionMapper;
    static {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        aclPermissionMapper = context.getBean(AclPermissionMapper.class);
    }
    @Test
    public void getListTest(){
//        System.out.println(aclPermissionMapper.getAll("0"));
    }
    @Test
    public void add() throws InterruptedException {
        AclPermission a1 = new AclPermission(String.valueOf(System.currentTimeMillis()), "1665544024777", "领养申请审核", 1, "", "", "", "", 1, 0, new Date(), new Date(), null);

        AclPermission a2 = new AclPermission(String.valueOf(System.currentTimeMillis()),"1665544024777","宠物列表",1,"","","","",1,0,new Date(),new Date(),null);
         AclPermission a3 = new AclPermission(String.valueOf(System.currentTimeMillis()),"1665544024777","宠物类型列表",1,"","","","",1,0,new Date(),new Date(),null);
        System.out.println(aclPermissionMapper.addPermission(a1));
    }
    @Test
    public void set(){
        List<String> ss=new ArrayList<>();
        ss.add("qwe");
        ss.add("qwe");
        String s = ss.toString();
        s=s.substring(1,s.length()-1);
        System.out.println(s);
    }
}
