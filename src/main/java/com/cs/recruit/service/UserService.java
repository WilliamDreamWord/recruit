package com.cs.recruit.service;

import com.cs.recruit.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by asus on 2018/8/3.
 */
public interface UserService {
    public User findByUserAndCard(User user);
    public int insert(User user);
}
