package com.cs.recruit.service;

import com.cs.recruit.dto.*;
import com.cs.recruit.entity.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Map;


/**
 * Created by asus on 2018/8/13.
 */
public interface InterviewService {
    //查询应聘者的申请状态
    public String selectRecruStatus(String user_id);
    //打开简历
    //查询是否填写过简历
    //查询申请表
    public Apply selectApply(User user);
    //插入申请表
    public int insertIntoApply(Apply apply);
    //更新应聘者申请状态
    public int updateApplyRecruStatus(String user_id);
    //更新申请表
    public int updateApply(Apply apply);
    //查询基本信息
    public Base selectBase(User user);
    //插入基本信息
    public int insertIntoBase(Base base);
    //更新应聘者申请状态
    public int updateBaseRecruStatus(String user_id);
    //更新基本信息
    public int updateBase(Base base);
    //查询教育经历
    public List<Teach> selectTeach(User user);
    //插入教育经历
    public int insertIntoTeach(Teach teach);
    //更新应聘者申请状态
    public int updateTeachRecruStatus(String user_id);
    //更新教育经历
    public int updateTeach(Teach teach);
    public int deleteTeach(User user);
    //查询工作经历
    public List<Work> selectWork(User user);
    //插入工作经历
    public int insertIntoWork(Work work);
    //更新应聘者申请状态
    public int updateWorkRecruStatus(String user_id);
    //更新工作经历
    public int updateWork(Work work);
    public int deleteWork(User user);
    //查询家庭情况
    public List<Family> selectFamily(User user);
    //插入家庭情况
    public int insertIntoFamily(Family family);
    public int updateFamilyRecruStatus(String user_id);
    //更新家庭情况
    public int updateFamily(Family family);
    public int deleteFamily(User user);
    //打开笔试题
    //查询是否做过笔试题
    //查询职务
    public String findPost(User user);
    //更新应聘者申请状态
    public int updateWriteRecruStatus(String user_id);
    //商务助理
    public Assistent_answer findAssistentWrite(User user);
    public int insertInotAss(Assistent_answer assistent_answer);
    public int updateAss(Assistent_answer assistent_answer);
    //其他职位
    public Other_answer findOtherWrite(User user);
    public int insertInotOther(Other_answer other_answer);
    public int updateOther(Other_answer other_answer);
    //区域销售
    public Sale_answer findSaleWrite(User user);
    public int insertInotSale(Sale_answer sale_answer);
    public int updateSale(Sale_answer sale_answer);

    //打开性格测试
    //查询性格测试
    public CharacterWriteDto findCharacter(User user);
    //插入答案JP类型
    public int insertIntoJP(Personality_JP_ans personality_jp_ans);
    public int insertIntoEI(Personality_EI_ans personality_ei_ans);
    public int insertIntoSN(Personality_SN_ans personality_sn_ans);
    public int insertIntoTF(Personality_TF_ans personality_tf_ans);
    //更新
    public int updateJP(Personality_JP_ans personality_jp_ans);
    public int updateEI(Personality_EI_ans personality_ei_ans);
    public int updateSN(Personality_SN_ans personality_sn_ans);
    public int updateTF(Personality_TF_ans personality_tf_ans);
    //查询所有题目
    public List<CWDto> findCharacterWrite();

    public Other_subject findOtherSubject();
    public Sale_subject findSaleSubject();
    public Assistent_subject findAssSubject();

    public String SumE(User user);
    public String SumI(User user);
    public String SumJ(User user);
    public String SumP(User user);
    public String SumS(User user);
    public String SumN(User user);
    public String SumT(User user);
    public String SumF(User user);
    public int insertIntoFace(Face face);
    public int insertResult(Result result);
    //更新应聘者申请状态
    public int updateResultRecruStatus(String user_id);
    public Map selectResult(User user);

    /**
     * 更新应聘者申请状态
     * 一面
     * 二面
     * 一审
     * 二审
     */
    public int updateFirstRecruStatus(String user_id);
    public int updateSecondRecruStatus(String user_id);
    public int updateFirst1RecruStatus(String user_id);
    public int updateSecond1RecruStatus(String user_id);

    //查看应聘者是否填写完简历
    public double selectResume(String user_id);
}
