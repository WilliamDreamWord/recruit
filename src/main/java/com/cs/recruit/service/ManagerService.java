package com.cs.recruit.service;

import com.cs.recruit.dto.*;
import com.cs.recruit.entity.User;

import java.util.List;

/**
 * Created by asus on 2018/8/10.
 */
public interface ManagerService {
    //查看所有已经通过面试者
    public List<listDto> findInterview2(String dept_id);
    //查看个人简历详情
    public DetailsDto findDetails(User user);
    //查看笔试结果详情
    public String findPost(User user);
    public AssistentWriteDto findWriteAssistent(User user);
    public OtherWriteDto findWriteOther(User user);
    public SaleWriteDto findWriteSale(User user);
    //查看面试评价
    public EvaluateDto findEvaluate(User user);
    //查看性格测试
    public CharacterDto findCharacter(User user);
    //决定是否录用
    public int UpdateEvaluate(EvaluateDto evaluateDto);
    //不录用
    public int updateUserNo(String user_id);
    //录用
    public int updateUserYes(String user_id);
}
