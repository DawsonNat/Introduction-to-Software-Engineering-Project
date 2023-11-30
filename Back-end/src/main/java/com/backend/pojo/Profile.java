package com.backend.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
    private Integer id;
    private String name;
    private String gender;
    private String age;
    private String city;
    private String phone;
    private String email;
    private String exams;
}