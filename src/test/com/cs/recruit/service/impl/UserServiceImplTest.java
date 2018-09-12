package com.cs.recruit.service.impl;


import com.cs.recruit.dao.UserDao;
import com.cs.recruit.entity.User;
import com.cs.recruit.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by asus on 2018/8/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Test
    public void findByUserAndCard() throws Exception {
        User user = new User();
        user.setUser_name("陈帅");
        user.setUser_card("500234111");
        System.out.println(userService.findByUserAndCard(user));
    }

}
