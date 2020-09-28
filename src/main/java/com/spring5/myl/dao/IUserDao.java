package com.spring5.myl.dao;

import com.spring5.myl.entity.User;

import java.util.List;

/**
 * 用户数据库持久化接口
 * @author bean-program
 */
public interface IUserDao {

    List<User> selectAll();

    void save();

    void update();

    void delete();


}
