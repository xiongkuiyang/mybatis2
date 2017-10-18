/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     com.atguigu.mapper
 *
 *    Filename:    UserMapper.java
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
 *    Create at:   2017年9月30日 下午10:00:13
 *
 *    Revision:
 *
 *    2017年9月30日 下午10:00:13
 *        - first revision
 *
 *****************************************************************/
package com.atguigu.mapper;

import java.util.List;

import com.atguigu.bean.User;


/**
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @Date 2017年9月30日 下午10:00:13
 */
public interface UserMapper {
    
    public User getUserById(int id);
    
    public List<User> getAllUsers();
    
    public int saveUser(User user);
    
    public int deleteUserById(int id);
    
    public int updateUser(User user);
    
}
