package com.cs.recruit.dao;

import com.cs.recruit.dto.*;
import com.cs.recruit.entity.User;

import java.util.List;

/**
 * 部门主管
 * Created by asus on 2018/8/10.
 */
public interface ManagerDao {
    //查看所有已经通过面试者
    public List<listDto> findInterview2(String dept_id);
    //查看个人简历详情
    public DetailsDto findDetails(String user_id);
    //查看笔试结果详情
    public String findPost(String user_id);
    public AssistentWriteDto findWriteAssistent(String user_id);
    public OtherWriteDto findWriteOther(String user_id);
    public SaleWriteDto findWriteSale(String user_id);
    //查看面试评价
    public EvaluateDto findEvaluate(String user_id);
    //查看性格测试
    public CharacterDto findCharacter(String user_id);
    //决定是否录用
    public int UpdateEvaluate(EvaluateDto evaluateDto);
    //不录用
    public int updateUserNo(String user_id);
    //录用
    public int updateUserYes(String user_id);
}
