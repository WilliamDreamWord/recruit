package com.cs.recruit.service.impl;

import com.cs.recruit.entity.Dept;
import com.cs.recruit.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;

import static org.junit.Assert.*;

/**
 * Created by asus on 2018/8/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class DeptServiceImplTest {
    @Autowired
    private DeptService deptService;
    @Test
    public void findDept() throws Exception {
        System.out.println(deptService.findDept());
    }

}