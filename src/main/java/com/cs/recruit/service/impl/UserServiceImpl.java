package com.cs.recruit.service.impl;

import com.cs.recruit.dao.UserDao;
import com.cs.recruit.entity.User;
import com.cs.recruit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by asus on 2018/8/6.
 */
//查询用户，若没有就插入，然后返回用户  若查询到此用户，直接返回用户
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public User findByUserAndCard(User user) {
        return userDao.findByUserAndCard(user);
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public User findByUser(User user) {
        return userDao.findByUser(user);
    }
}
