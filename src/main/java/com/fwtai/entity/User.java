package com.fwtai.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-03 10:55
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@Entity
public class User{

    @Id
    private Integer id;

    private String name;

    private Integer age;

    private String sex;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    @Override
    public String toString(){
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", sex='" + sex + '\'' + '}';
    }
}