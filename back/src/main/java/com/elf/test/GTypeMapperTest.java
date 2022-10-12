package com.elf.test;

import com.elf.mapper.GTypeMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

public class GTypeMapperTest {
    private static GTypeMapper gTypeMapper;
    static {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        gTypeMapper = context.getBean(GTypeMapper.class);
    }


    @Test
    public void getAllTest(){

    }
}
