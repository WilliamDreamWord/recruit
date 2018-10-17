package com.cs.recruit.service.impl;

import com.cs.recruit.dao.HumanDao;
import com.cs.recruit.dao.ManagerDao;
import com.cs.recruit.dto.DetailsDto;
import com.cs.recruit.dto.EvaluateDto;
import com.cs.recruit.dto.InterviewDto;
import com.cs.recruit.dto.listDto;
import com.cs.recruit.entity.User;
import com.cs.recruit.service.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by asus on 2018/8/13.
 */
@Service
public class HumanServiceImpl implements HumanService {
    @Autowired
    private ManagerDao managerDao;
    @Autowired
    private HumanDao humanDao;

    //查看应聘相应职位的面试者待录取
    @Override
    public List<listDto> findInterview(String post) {
        listDto listdto = new listDto();
        List<listDto> listDtos = new ArrayList<listDto>();
        List<String> stringList = new ArrayList<String>();

//        System.out.println(post);
//        System.out.println("---------------------------");
//        System.out.println("区域销售".equals(post) || "商务助理".equals(post) );

        if ( "区域销售".equals(post) || "商务助理".equals(post) ){
            stringList = humanDao.findUserId(post);
        }else {
            stringList = humanDao.findUserid();
        }

        for (String s:stringList) {
            listdto = humanDao.findInterview(s);
            listDtos.add(listdto);
        }

        return listDtos;

    }

    @Override
    public List<listDto> findStuInterview() {
        listDto listdto = new listDto();
        List<listDto> listDtos = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        stringList = humanDao.findStuId();
        for (String s:stringList) {
            listdto = humanDao.findStuInterview(s);
            listDtos.add(listdto);
        }

        return listDtos;
    }


    public List<listDto> findInterviewno(){
        return humanDao.findInterviewno();
    }

    //查看面试者详情待录取
    @Override
    public DetailsDto findDetails(User user) {
        return humanDao.findDetails(user.getUser_id());
    }

    //进行部门分配
    @Override
    public int updataDept(HashMap hashMap) {
        return  humanDao.updataDept(hashMap);
    }

    @Override
    public String  selectDept(User user) {
         return humanDao.selectDept(user.getUser_id());
    }

    @Override
    public EvaluateDto findEvaluate(String user_id) {
        return humanDao.findEvaluate(user_id);
    }

    @Override
    public int createEvalute(EvaluateDto evaluateDto) {
        return humanDao.createEvalute(evaluateDto);
    }

    @Override
    public int createFirsttry(EvaluateDto evaluateDto) {
        return humanDao.createFirsttry(evaluateDto);
    }

    @Override
    public int createSecondtry(EvaluateDto evaluateDto) {
        return humanDao.createSecondtry(evaluateDto);
    }

    @Override
    public int createEmploy(EvaluateDto evaluateDto) {
        return humanDao.createEmploy(evaluateDto);
    }

    //进行评价是否通过该轮面试
    @Override
    public int UpdateEvaluate(EvaluateDto evaluateDto) {
        return humanDao.UpdateEvaluate(evaluateDto);
    }

    @Override
    public int updateFirstNo(String user_id) {
        return humanDao.updateFirstNo(user_id);
    }

    @Override
    public int updateFirstYes(String user_id) {
        return humanDao.updateFirstYes(user_id);
    }

    @Override
    public int updateSecondNo(String user_id) {
        return humanDao.updateSecondNo(user_id);
    }

    @Override
    public int updateSecondYes(String user_id) {
        return humanDao.updateSecondYes(user_id);
    }

    @Override
    public int updateEmployNo(String user_id) {
        return humanDao.updateEmployNo(user_id);
    }

    @Override
    public int updateEmployYes(String user_id) {
        return humanDao.updateEmployYes(user_id);
    }

    //人力不通过 不录用
    @Override
    public int updateManagerNo(String user_id) {
        return humanDao.updateManagerNo(user_id);
    }


    //查看已录取应聘者
    @Override
    public List<InterviewDto> findInterviewed() {
        return humanDao.findInterviewed();
    }

    //查看详情（已录取）
    @Override
    public DetailsDto findDetailsed(User user) {
        return humanDao.findDetailsed(user.getUser_id());
    }

    //查看被驳回面试者
    @Override
    public List<InterviewDto> findInterviewun() {
        return humanDao.findInterviewun();
    }

    @Override
    public DetailsDto findDetailsun(User user) {
        return humanDao.findDetailsun(user.getUser_id());
    }

    //确认驳回
    @Override
    public int UpdateUser(User user) {
        return humanDao.UpdateUser(user);
    }
}
