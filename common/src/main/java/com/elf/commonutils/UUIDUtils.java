package com.elf.commonutils;

import java.util.UUID;

public class UUIDUtils {
    public static String getUUID(){
        String s = UUID.randomUUID().toString();
        String[] split = s.split("-");
        return split[0]+split[1];
    }
}
