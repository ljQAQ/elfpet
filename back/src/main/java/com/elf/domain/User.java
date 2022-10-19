package com.elf.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
   private Integer id;
   private String account;
   private String password;
   private String nickname;
   private Long phone;
   private String email;
   private Integer idCard;
   private Date birth;
   private Integer gender;
   private String avatar;
   private String description;
   private Date createTime;

}
