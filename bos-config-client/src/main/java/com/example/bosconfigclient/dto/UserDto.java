package com.example.bosconfigclient.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.xml.crypto.Data;


public class UserDto {
    @NotBlank(message = "名字不能为空")
    @Length(min = 1,max = 20)
    private String name;
    @NotBlank(message = "密码不能为空")
    @Length(min = 6,max = 16,message = "密码长度需要在6和16之间")
    private String pass;
    @NotBlank(message = "电话号码不能为空")
    @Length(min = 11,max = 11)
    private String phone;
    @NotBlank(message = "性别不能为空")
    @Length(min = 1,max = 1,message = "性别选择异常")
    private String sex;
    private Data createTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Data getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Data createTime) {
        this.createTime = createTime;
    }
}
