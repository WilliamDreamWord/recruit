package com.cs.recruit.service.impl;

import com.cs.recruit.dao.DeptDao;

import com.cs.recruit.entity.Dept;
import com.cs.recruit.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by asus on 2018/8/6.
 */
@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    private DeptDao deptDao;
    @Override
    public List<Dept> findDept() {
        return deptDao.findDept();
    }
}
