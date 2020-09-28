package com.spring5.myl.entity;

import lombok.Data;

/**
 * 用户类
 * @author bean-program
 */
@Data
public class User {

    private String id;
    private String username;
    private String password;
    private Integer age;
    private Boolean married;
    private String[] hobbies;
}
