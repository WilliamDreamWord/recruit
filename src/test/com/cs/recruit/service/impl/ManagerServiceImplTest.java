//package com.cs.recruit.service.impl;
//
//import com.cs.recruit.entity.User;
//import com.cs.recruit.service.ManagerService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.net.UnknownHostException;
//
//import static org.junit.Assert.*;
//
///**
// * Created by asus on 2018/8/13.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
//public class ManagerServiceImplTest {
//    @Autowired
//    private ManagerService managerService;
//    @Test
//    public void findInterview2() throws Exception {
//        System.out.println(managerService.findInterview2());
//    }
//    @Test
//    public void findDetails() throws Exception{
//        User user = new User();
//        user.setUser_id("fdaf21ae-6266-47c5-865d-dfe0fa994c26");
//        System.out.println(managerService.findDetails(user));
//    }
//    @Test
//    public void findPost(){
//        User user = new User();
//        user.setUser_id("fdaf21ae-6266-47c5-865d-dfe0fa994c26");
//        System.out.println(managerService.findPost(user)); user.setUser_id("fdaf21ae-6266-47c5-865d-dfe0fa994c26");
//    }
//    @Test
//    public void findWriteOther(){
//        User user = new User();
//        user.setUser_id("fdaf21ae-6266-47c5-865d-dfe0fa994c26");
//        System.out.println(managerService.findWriteOther(user));
//    }
//
//}