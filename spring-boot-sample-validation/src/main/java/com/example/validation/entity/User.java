package com.example.validation.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotEmpty;

/**
 * .
 *
 * @author wangzhuofan@beyondsoft.com
 * @version 1.0
 * @date 2019-09-11
 */
public class User {
    @NotEmpty(message = "用户名称不能为空。")
    private String userName;
    @Range(max = 150, min = 5, message = "年龄范围应该在1-150内。")
    private int age;

    @NotEmpty(message = "密码不能为空")
    @Length(min = 6, max = 8, message = "密码长度为6-8位。")
    //@Length(min = 6, max = 8)
    private String passwd;

    public User() {
        super();
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}