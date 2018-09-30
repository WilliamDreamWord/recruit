package com.cs.recruit.service;

import com.cs.recruit.dto.DetailsDto;
import com.cs.recruit.dto.EvaluateDto;
import com.cs.recruit.dto.InterviewDto;
import com.cs.recruit.dto.listDto;
import com.cs.recruit.entity.User;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.List;

/**
 * Created by asus on 2018/8/13.
 */
public interface HumanService {
    //查看应聘相应职位的面试者待录取
    public List<listDto> findInterview(String post);
    public List<listDto> findInterviewno();
    //查看面试者详情待录取
    public DetailsDto findDetails(User user);
    //进行部门分配
    public int updataDept(HashMap hashMap);
    public String selectDept(User user);

    //查看面试评价表
    public EvaluateDto findEvaluate(String user_id);
    public int createEvalute(EvaluateDto evaluateDto);
    public int createFirsttry(EvaluateDto evaluateDto);
    public int createSecondtry(EvaluateDto evaluateDto);
    public int createEmploy(EvaluateDto evaluateDto);


    //进行评价是否通过该轮面试
    public int UpdateEvaluate(EvaluateDto evaluateDto);
    //未通过第一轮面试
    public int updateFirstNo(String user_id);
    //通过第一轮面试
    public int updateFirstYes(String user_id);
    //未通过第二轮面试
    public int updateSecondNo(String user_id);
    //通过第二轮面试
    public int updateSecondYes(String user_id);
    //被驳回
    public int updateEmployNo(String user_id);
    //已录用
    public int updateEmployYes(String user_id);

    //人力不通过 不录用
    public int updateManagerNo(String user_id);

    //查看已录取应聘者
    public List<InterviewDto> findInterviewed();
    //查看详情（已录取）
    public DetailsDto findDetailsed(User user);

    //查看被驳回面试者
    public List<InterviewDto> findInterviewun();
    public DetailsDto findDetailsun(User user);
    //确认驳回
    public int UpdateUser(User user);
}
