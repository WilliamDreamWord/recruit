package com.cs.recruit.service.impl;

import com.cs.recruit.entity.Job;
import com.cs.recruit.service.JobService;
import jdk.nashorn.internal.scripts.JO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

import static org.junit.Assert.*;

/**
 * Created by asus on 2018/8/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class JobServiceImplTest {
    @Autowired
    private JobService jobService;
    @Test
    public void findJobByUserAndPassword() throws Exception {
        Job job = new Job();
        job.setJob_user("陈帅");
        job.setJob_password("L2323994483");
        System.out.println(jobService.findJobByUserAndPassword(job));
    }

    @Test
    public void insert() throws Exception {
        Job job = new Job();
        job.setDept_id("1");
        job.setJob_id(UUID.randomUUID().toString());
        job.setJob_password("123");
        job.setJob_user("廖秋露");
        job.setJob_descript("软件开发工程师");
        System.out.println(jobService.insert(job));
    }

}