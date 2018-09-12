package com.cs.recruit.dao;

import com.cs.recruit.entity.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by asus on 2018/8/6.
 */
@Repository
public interface DeptDao {
    public List<Dept> findDept();
}
