/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     com.atguigu.test
 *
 *    Filename:    UserMapperTest.java
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
 *    Create at:   2017年9月30日 下午10:16:35
 *
 *    Revision:
 *
 *    2017年9月30日 下午10:16:35
 *        - first revision
 *
 *****************************************************************/
package com.atguigu.test;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.builder.annotation.MapperAnnotationBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import com.atguigu.bean.User;
import com.atguigu.mapper.UserMapper;
import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;

public class UserMapperTest {
    static SqlSession sqlSession = null;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession =  sqlSessionFactory.openSession();
    }

    @Test
    public void testGetUserById() {
        try{
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.getUserById(1);
            System.out.println(user);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    @Test
    public void testGetAllUsers() {
        try{
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = mapper.getAllUsers();
            System.out.println(users);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    @Test
    public void testSaveUser() {
        try{
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = new User("李四",0);
            int row = mapper.saveUser(user);
            System.out.println(row);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    @Test
    public void testDeleteUserById() {
        try{
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int row = mapper.deleteUserById(11);
            System.out.println(row);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    @Test
    public void testUpdateUser() {
        try{
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = new User(10,"tom", 0);
            int row = mapper.updateUser(user);
            System.out.println(row);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

}
