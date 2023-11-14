package com.backend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String account;
    private String password;
    private Integer age;
    private String city;
    private String phone;
    private String mail;
    private String test;
}
