package com.cs.recruit.service.impl;

import com.cs.recruit.dao.InterviewDao;
import com.cs.recruit.dto.*;
import com.cs.recruit.entity.*;
import com.cs.recruit.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2018/8/13.
 */
@Service
public class InterviewServiceImpl implements InterviewService {
    @Autowired
    private InterviewDao interviewDao;

    @Override
    public Apply selectApply(User user) {
        return interviewDao.selectApply(user.getUser_id());
    }

    @Override
    public int insertIntoApply(Apply apply) {
        return interviewDao.insertIntoApply(apply);
    }

    @Override
    public int updateApply(Apply apply) {
         return interviewDao.updateApply(apply);
    }

    @Override
    public Base selectBase(User user) {
        return interviewDao.selectBase(user.getUser_id());
    }

    @Override
    public int insertIntoBase(Base base) {
          return interviewDao.insertIntoBase(base);
    }

    @Override
    public int updateBase(Base base) {
         return interviewDao.updateBase(base);
    }

    @Override
    public List<Teach> selectTeach(User user) {
        return interviewDao.selectTeach(user.getUser_id());
    }

    @Override
    public int insertIntoTeach(Teach teach) {
         return interviewDao.insertIntoTeach(teach);
    }

    @Override
    public int updateTeach(Teach teach) {
         return interviewDao.updateTeach(teach);
    }
    @Override
    public int deleteTeach(User user){
        return interviewDao.deleteTeach(user.getUser_id());
    }

    @Override
    public List<Work> selectWork(User user) {
        return interviewDao.selectWork(user.getUser_id());
    }

    @Override
    public int insertIntoWork(Work work) {
         return interviewDao.insertIntoWork(work);
    }

    @Override
    public int updateWork(Work work) {
         return interviewDao.updateWork(work);
    }

    @Override
    public int deleteWork(User user) {
        return interviewDao.deleteWork(user.getUser_id());
    }


    @Override
    public List<Family> selectFamily(User user) {
        return interviewDao.selectFamily(user.getUser_id());
    }

    @Override
    public int insertIntoFamily(Family family) {
         return interviewDao.insertIntoFamily(family);
    }

    @Override
    public int updateFamily(Family family) {
        return interviewDao.updateFamily(family);
    }

    @Override
    public int deleteFamily(User user) {
        return interviewDao.deleteFamily(user.getUser_id());
    }

    @Override
    public String findPost(User user) {
        return interviewDao.findPost(user.getUser_id());
    }

    @Override
    public Assistent_answer findAssistentWrite(User user) {
        return interviewDao.findAssistentWrite(user.getUser_id());
    }

    @Override
    public int insertInotAss(Assistent_answer assistent_answer) {
        return interviewDao.insertInotAss(assistent_answer);
    }

    @Override
    public int updateAss(Assistent_answer assistent_answer) {
        return interviewDao.updateAss(assistent_answer);
    }

    @Override
    public Other_answer findOtherWrite(User user) {
        return interviewDao.findOtherWrite(user.getUser_id());
    }

    @Override
    public int insertInotOther(Other_answer other_answer) {
        return interviewDao.insertInotOther(other_answer);
    }

    @Override
    public int updateOther(Other_answer other_answer) {
         return interviewDao.updateOther(other_answer);
    }

    @Override
    public Sale_answer findSaleWrite(User user) {
        return interviewDao.findSaleWrite(user.getUser_id());
    }

    @Override
    public int insertInotSale(Sale_answer sale_answer) {
         return interviewDao.insertInotSale(sale_answer);
    }

    @Override
    public int updateSale(Sale_answer sale_answer) {
         return interviewDao.updateSale(sale_answer);
    }

    @Override
    public CharacterWriteDto findCharacter(User user) {
        return interviewDao.findCharacter(user.getUser_id());
    }

    @Override
    public int insertIntoJP(Personality_JP_ans personality_jp_ans) {
         return interviewDao.insertIntoJP(personality_jp_ans);
    }

    @Override
    public int insertIntoEI(Personality_EI_ans personality_ei_ans) {
         return interviewDao.insertIntoEI(personality_ei_ans);
    }

    @Override
    public int insertIntoSN(Personality_SN_ans personality_sn_ans) {
         return interviewDao.insertIntoSN(personality_sn_ans);
    }

    @Override
    public int insertIntoTF(Personality_TF_ans personality_tf_ans) {
         return interviewDao.insertIntoTF(personality_tf_ans);
    }

    @Override
    public int updateJP(Personality_JP_ans personality_jp_ans) {
         return interviewDao.updateJP(personality_jp_ans);
    }

    @Override
    public int updateEI(Personality_EI_ans personality_ei_ans) {
         return interviewDao.updateEI(personality_ei_ans);
    }

    @Override
    public int updateSN(Personality_SN_ans personality_sn_ans) {
         return interviewDao.updateSN(personality_sn_ans);
    }

    @Override
    public int updateTF(Personality_TF_ans personality_tf_ans) {
         return interviewDao.updateTF(personality_tf_ans);
    }

    @Override
    public List<CWDto> findCharacterWrite() {
        List<CWDto> cwDto = new ArrayList<CWDto>();
        List<CWDto> cwDtoList = new ArrayList<CWDto>();
        List<Personality_EI> personality_eiList = new ArrayList<Personality_EI>();
        List<Personality_JP> personality_jpList = new ArrayList<Personality_JP>();
        List<Personality_SN> personality_snList = new ArrayList<Personality_SN>();
        List<Personality_TF> personality_tfList = new ArrayList<Personality_TF>();
        personality_eiList = interviewDao.findEI();
        System.out.println(personality_eiList);
        personality_jpList = interviewDao.findJP();
        System.out.println(personality_jpList);
        personality_snList = interviewDao.findSN();
        System.out.println(personality_snList);
        personality_tfList = interviewDao.findTF();
        System.out.println(personality_tfList);
        for (Personality_EI ei: personality_eiList) {
            CWDto cwDto1 = new CWDto();
            cwDto1.setId(ei.getEI_id());
            cwDto1.setNum(ei.getEI_num());
            cwDto1.setName(ei.getEI_name());
            cwDto1.setA(ei.getEI_a());
            cwDto1.setB(ei.getEI_b());
            cwDto.add(cwDto1);
        }
        for (Personality_SN sn:personality_snList){
            CWDto cwDto1 = new CWDto();
            cwDto1.setId(sn.getSN_id());
            cwDto1.setNum(sn.getSN_num());
            cwDto1.setName(sn.getSN_name());
            cwDto1.setA(sn.getSN_a());
            cwDto1.setB(sn.getSN_b());
            cwDto.add(cwDto1);
        }
        for (Personality_JP jp:personality_jpList) {
            CWDto cwDto1 = new CWDto();
            cwDto1.setId(jp.getJP_id());
            cwDto1.setNum(jp.getJP_num());
            cwDto1.setName(jp.getJP_name());
            cwDto1.setA(jp.getJP_a());
            cwDto1.setB(jp.getJP_b());
            cwDto.add(cwDto1);
        }
        for (Personality_TF tf:personality_tfList){
            CWDto cwDto1 = new CWDto();
            cwDto1.setId(tf.getTF_id());
            cwDto1.setNum(tf.getTF_num());
            cwDto1.setName(tf.getTF_name());
            cwDto1.setA(tf.getTF_a());
            cwDto1.setB(tf.getTF_b());
            cwDto.add(cwDto1);
        }
        for (int i = 1; i <= 48;){
            for (CWDto cwDto1:cwDto) {
                try {
                    if (Integer.parseInt(cwDto1.getNum()) == i){
                        cwDtoList.add(cwDto1);
                        i++;
                    }
                }catch (NumberFormatException e){
                    e.printStackTrace();
                }
            }
        }
        return cwDtoList;
    }

    @Override
    public Other_subject findOtherSubject() {
        return interviewDao.findOtherSubject();
    }

    @Override
    public Sale_subject findSaleSubject() {
        return interviewDao.findSaleSubject();
    }

    @Override
    public Assistent_subject findAssSubject() {
        return interviewDao.findAssSubject();
    }

    @Override
    public String SumE(User user) {
        return interviewDao.SumE(user.getUser_id());
    }

    @Override
    public String SumI(User user) {
        return interviewDao.SumI(user.getUser_id());
    }

    @Override
    public String SumJ(User user) {
        return interviewDao.SumJ(user.getUser_id());
    }

    @Override
    public String SumP(User user) {
        return interviewDao.SumP(user.getUser_id());
    }

    @Override
    public String SumS(User user) {
        return interviewDao.SumS(user.getUser_id());
    }

    @Override
    public String SumN(User user) {
        return interviewDao.SumN(user.getUser_id());
    }

    @Override
    public String SumT(User user) {
        return interviewDao.SumT(user.getUser_id());
    }

    @Override
    public String SumF(User user) {
        return interviewDao.SumF(user.getUser_id());
    }

    @Override
    public int insertIntoFace(Face face) {
        return interviewDao.insertIntoFace(face);
    }

    @Override
    public int insertResult(Result result) {
        return interviewDao.insertResult(result);
    }

    @Override
    public Result selectResult(User user) {

        System.out.println("---------------------------------------");
        System.out.println(interviewDao.selectResult(user.getUser_id()));
        System.out.println(user.getUser_id());
        return interviewDao.selectResult(user.getUser_id());
    }
}
