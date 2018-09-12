package com.cs.recruit.dao;

import com.cs.recruit.dto.CWDto;
import com.cs.recruit.dto.CharacterWriteDto;
import com.cs.recruit.dto.DetailsDto;
import com.cs.recruit.entity.*;

import java.awt.*;
import java.util.List;

/**
 * Created by asus on 2018/8/13.
 */
public interface InterviewDao {
    //打开简历
    //查询是否填写过简历
    //查询申请表
    public Apply selectApply(String user_id);
    //插入申请表
    public int insertIntoApply(Apply apply);
    //更新申请表
    public int updateApply(Apply apply);
    //查询基本信息
    public Base selectBase(String user_id);
    //插入基本信息
    public int insertIntoBase(Base base);
    //更新基本信息
    public int updateBase(Base base);
    public int deleteTeach(String user_id);
    //查询教育经历
    public List<Teach> selectTeach(String user_id);
    //插入教育经历
    public int insertIntoTeach(Teach teach);
    //更新教育经历
    public int updateTeach(Teach teach);
    //查询工作经历
    public List<Work> selectWork(String user_id);
    //插入工作经历
    public int insertIntoWork(Work work);
    //更新工作经历
    public int updateWork(Work work);
    public int deleteWork(String user_id);
    //查询家庭情况
    public List<Family> selectFamily(String user_id);
    //插入家庭情况
    public int insertIntoFamily(Family family);
    //更新家庭情况
    public int updateFamily(Family family);
    public int deleteFamily(String user_id);
    //打开笔试题
    //查询是否做过笔试题
    //查询职务
    public String findPost(String user_id);
    //商务助理
    public Assistent_answer findAssistentWrite(String user_id);
    public int insertInotAss(Assistent_answer assistent_answer);
    public int updateAss(Assistent_answer assistent_answer);
    //其他职位
    public Other_answer findOtherWrite(String user_id);
    public int insertInotOther(Other_answer other_answer);
    public int updateOther(Other_answer other_answer);
    //区域销售
    public Sale_answer findSaleWrite(String user_id);
    public int insertInotSale(Sale_answer sale_answer);
    public int updateSale(Sale_answer sale_answer);

    //打开性格测试
    //查询性格测试
    public CharacterWriteDto findCharacter(String user_id);
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
    public List<Personality_SN> findSN();
    public List<Personality_TF> findTF();
    public List<Personality_JP> findJP();
    public List<Personality_EI> findEI();
    public Other_subject findOtherSubject();
    public Sale_subject findSaleSubject();
    public Assistent_subject findAssSubject();

    public String SumE(String user_id);
    public String SumI(String user_id);
    public String SumJ(String user_id);
    public String SumP(String user_id);
    public String SumS(String user_id);
    public String SumN(String user_id);
    public String SumT(String user_id);
    public String SumF(String user_id);
    public int insertIntoFace(Face face);

    public int insertResult(Result result);
    public Result selectResult(String user_id);
}
