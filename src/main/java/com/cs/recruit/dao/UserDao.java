package com.cs.recruit.dao;


import com.cs.recruit.entity.*;

/**
 * Created by asus on 2018/8/6.
 */
public interface UserDao {
    public User findByUserAndCard(User user);
    public int insert(User user);
}
