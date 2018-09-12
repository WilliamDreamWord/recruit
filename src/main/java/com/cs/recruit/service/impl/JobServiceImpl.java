package com.cs.recruit.service.impl;

import com.cs.recruit.dao.JobDao;
import com.cs.recruit.dto.JobDto;
import com.cs.recruit.entity.Job;
import com.cs.recruit.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by asus on 2018/8/6.
 */
@Service
public class JobServiceImpl implements JobService{
    @Autowired
    private JobDao jobDao;
    @Override
    public JobDto findJobByUserAndPassword(Job job) {
        System.out.println("ssssssss");
        return jobDao.findJobByUserAndPassword(job);
    }

    @Override
    public int insert(Job job) {
        return jobDao.insert(job);
    }
}
