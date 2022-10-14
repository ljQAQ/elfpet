package com.elf.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AclUser {
    private String id;
    private String username;
    private String password;
    private String nickName;
    private String salt;
    private String token;
    private Integer isDeleted = 0;
    private Date gmtCreate;
    private Date gmtModified;
}
