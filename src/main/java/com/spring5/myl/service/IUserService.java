package com.spring5.myl.service;

import com.spring5.myl.entity.User;

import java.util.List;

public interface IUserService {

    List<User> selectAllUser();

    void saveUser();

    void updateUser();

    void deleteUser();
}
