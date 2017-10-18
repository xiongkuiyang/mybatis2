/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     com.atguigu.mybatis.bean
 *
 *    Filename:    User.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *    Copyright:   Copyright (c) 2001-2014
 *
 *    Company:     Digital Telemedia Co.,Ltd
 *
 *    @author:     Administrator
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年9月30日 下午4:31:27
 *
 *    Revision:
 *
 *    2017年9月30日 下午4:31:27
 *        - first revision
 *
 *****************************************************************/
package com.atguigu.bean;

/**
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @Date 2017年9月30日 下午4:31:27
 */
public class User {
    private int id;
    private String lastName;
    private int sex;
    
    public User(){}
    
    public User(String lastName, int sex) {
        this.lastName = lastName;
        this.sex = sex;
    }

    public User(int id, String lastName, int sex) {
        this.id = id;
        this.lastName = lastName;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getSex() {
        return sex;
    }
    
    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", lastName=" + lastName + ", sex=" + sex + "]";
    }
    
    
}
