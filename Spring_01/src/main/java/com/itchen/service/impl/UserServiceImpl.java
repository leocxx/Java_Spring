package com.itchen.service.impl;

import com.itchen.dao.UserDao;
import com.itchen.domain.User;
import com.itchen.service.UserService;

import java.util.List;

/**
 * @author KevinWilliams
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> findAll() {
        return userDao.findAll();
    }
}
