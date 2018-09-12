package com.cs.recruit.service.impl;

import com.cs.recruit.dto.EvaluateDto;
import com.cs.recruit.entity.User;
import com.cs.recruit.service.HumanService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.UUID;


/**
 * Created by asus on 2018/8/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class HumanServiceImplTest {
    @Autowired
    private HumanService humanService;
    @Test
    public void findInterview() throws Exception {
        System.out.println(humanService.findInterview("商务助理"));
    }
    @Test
    public void findInterviewno() throws Exception{
        System.out.println(humanService.findInterviewno());
    }
    @Test
    public void findDetails() throws Exception{
        User user = new User();
        user.setUser_id("1ea5f7ba-5856-4478-9ee3-58bb4c9c39c9");
        System.out.println(humanService.findDetails(user));
    }
    @Test
    public void updataDept() throws Exception{
        HashMap hashMap = new HashMap();
        hashMap.put("User_id","57bb2af9-72be-4dc2-89c4-ff2ab96f2576");
        hashMap.put("dept_id","1");
        System.out.println(humanService.updataDept(hashMap));
    }
    @Test
    public void selectDept() throws Exception{
        User user = new User();
        user.setUser_id("57bb2af9-72be-4dc2-89c4-ff2ab96f2576");
        System.out.println(humanService.selectDept(user));
    }

    @Test
    public void findEvaluate(){
        User user = new User();
        user.setUser_id("1ea5f7ba-5856-4478-9ee3-58bb4c9c39c9");
        System.out.println(humanService.findEvaluate(user));
    }
    @Test
    public void createEvalute(){
        EvaluateDto evaluateDto = new EvaluateDto();
        evaluateDto.setUser_id("f21ae-6266-47c5-865d-dfe0fa994c26");
        evaluateDto.setEvaluate_id(UUID.randomUUID().toString());
        evaluateDto.setDept_name("人力资源部");
        evaluateDto.setDept_id("2");
        evaluateDto.setRale_name("陈帅");
        evaluateDto.setPost("软件开发工程师");
        System.out.println(humanService.createEvalute(evaluateDto));
    }

    @Test
    public void findInterviewed(){
        System.out.println(humanService.findInterviewed());
    }
    @Test
    public void findDetailsed(){
        User user = new User();
        user.setUser_id("fdaf21ae-6266-47c5-865d-dfe0fa994c26");
        System.out.println(humanService.findDetailsed(user));
    }
    @Test
    public void findInterviewun(){
        System.out.println(humanService.findInterviewun());
    }
    @Test
    public void findDetailsun(){
        User user = new User();
        user.setUser_id("fdaf21ae-6266-47c5-865d-dfe0fa994c26");
        System.out.println(humanService.findDetailsun(user));
    }

}