package com.itchen.dao;

import com.itchen.domain.User;

import java.util.List;

/**
 * @author KevinWilliams
 */
public interface UserDao {
    List<User> findAll();
}
