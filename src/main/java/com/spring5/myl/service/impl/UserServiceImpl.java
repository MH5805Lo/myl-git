package com.spring5.myl.service.impl;

import com.spring5.myl.dao.IUserDao;
import com.spring5.myl.entity.User;
import com.spring5.myl.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> selectAllUser() {
        return userDao.selectAll();
    }

    @Override
    public void saveUser() {

    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser() {

    }
}
