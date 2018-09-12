package com.cs.recruit.dao;

import com.cs.recruit.dto.JobDto;
import com.cs.recruit.entity.Job;

import java.util.List;

/**
 * Created by asus on 2018/8/6.
 */
public interface JobDao {
    public JobDto findJobByUserAndPassword(Job job);//管理员登录
    public int insert(Job job);//添加管理员
}
