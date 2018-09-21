package com.cs.recruit.service.impl;

import com.cs.recruit.entity.*;
import com.cs.recruit.service.InterviewService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.event.TransactionalEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by asus on 2018/8/10.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class InterviewServiceImplTest {
    @Autowired
    private InterviewService interviewService;
   @Test
   public void selectApply() throws Exception {
       User user = new User();
        user.setUser_id("57bb2af9-72be-4dc2-89c4-ff2ab96f2576");
        System.out.println(interviewService.selectApply(user));
    }
    @Test
    public void insertIntoApply()throws Exception{
        Apply apply = new Apply();
        apply.setApply_id(UUID.randomUUID().toString());
        apply.setUser_id("1123");
        apply.setComedate("2018-08-14");
        apply.setFormdate("2018-08-14");
        apply.setMoney("200000");
        apply.setPost("软件开发工程师");
        System.out.println(apply);
        System.out.println(interviewService.insertIntoApply(apply));
    }
    @Test
    public void updateApply()throws Exception{
        Apply apply = new Apply();
        apply.setApply_id("d6ae4f12-44df-4d1c-87ae-953a8f4c2998");
        apply.setPost("软件开发工程师");
        apply.setMoney("30000");
        apply.setComedate("2018-08-14");
        apply.setFormdate("2018-04-14");
        apply.setUser_id("1123");
        System.out.println(interviewService.updateApply(apply));
    }
    @Test
    public void selectBase() throws Exception{
        User user = new User();
        user.setUser_id("fdaf21ae-6266-47c5-865d-dfe0fa994c26");
        System.out.println(interviewService.selectBase(user));
    }
    @Test
    public void insertIntoBase() throws Exception{
        Base base = new Base();
        base.setBase_id("2cf7c819-4de4-4f60-9d13-8bddedf5cda3");
        base.setUser_id("fdaf21ae-6266-47c5-865d-dfe0fa994c26");
        base.setDept_id("1");
        base.setAddress("重庆市");
        base.setBirthday("1997-02-10");
        base.setCertificate("全国大学英语四级，重庆计算机2级，学业奖学金3等奖");
        base.setContact_name("陈帅");
        base.setContact_phone("17749974957");
        base.setEmail("2323994483@qq.com");
        base.setFriend("陈帅");
        base.setHaw("178cm 63kg");
        base.setHobby("LOL");
        base.setIdcard("500234199702105776");
        base.setJob("是");
        base.setLanguage("英语");
        base.setNation("汉族");
        base.setPhone("17749974957");
        base.setRale_name("陈帅");
        base.setSex("男");
        System.out.println(interviewService.insertIntoBase(base));
    }
    @Test
    public void updateBase() throws Exception{
        Base base = new Base();
        base.setBase_id("2cf7c819-4de4-4f60-9d13-8bddedf5cda3");
        base.setAddress("重庆市");
        base.setBirthday("1997-02-10");
        base.setCertificate("全国大学英语四级，重庆计算机2级，学业奖学金3等奖");
        base.setContact_name("陈帅");
       base.setContact_phone("17749974957");
        base.setEmail("2323994483@qq.com");
        base.setFriend("陈帅");
        base.setHaw("178cm 63kg");
        base.setHobby("LOL、篮球");
        base.setIdcard("500234199702105776");
        base.setJob("是");
        base.setLanguage("英语");
        base.setNation("汉族");
        base.setPhone("17749974957");
        base.setRale_name("陈帅");
        base.setSex("男");
        System.out.println(interviewService.updateBase(base));
    }

    @Test
    public void selectTeach() throws Exception{
        User user = new User();
        user.setUser_id("fdaf21ae-6266-47c5-865d-dfe0fa994c26");
        System.out.println(interviewService.selectTeach(user));
    }
    @Test
    public void insertIntoTeach() throws Exception{
        Teach teach = new Teach();

        teach.setTeach_id(UUID.randomUUID().toString());
        teach.setBegandend("2015-09-10——至今");
        teach.setMajor("计算机科学与技术");
        teach.setRecord("本科");
        teach.setSchoole("重庆邮电大学");
        System.out.println(interviewService.insertIntoTeach(teach));
    }
    @Test
    public void updateTeach1() throws Exception{
        Teach teach = new Teach();
        teach.setTeach_id("136cf3b9-e860-4d8e-a682-7a784dde00f4");
        teach.setBegandend("2015-09-10——至今");
        teach.setMajor("计算机科学与技术");
        teach.setRecord("本科");
        teach.setSchoole("黄桷垭电子技校");
        System.out.println(interviewService.updateTeach(teach));
    }
    @Test
    public void selectWork() throws Exception{
        User user = new User();
        user.setUser_id("fdaf21ae-6266-47c5-865d-dfe0fa994c26");
        System.out.println(interviewService.selectWork(user));
    }
    @Test
    public void insertIntoWork()throws Exception{
        Work work = new Work();
        work.setWork_id(UUID.randomUUID().toString());
        work.setBegandend("2018-07-16——至今");
        work.setComname("重庆品胜科技公司");
        work.setMoney("2000");
        work.setPeoplenum("500");
        System.out.println(interviewService.insertIntoWork(work));
    }
    @Test
    public void updateWork() throws Exception{
        Work work = new Work();
        work.setWork_id("27c68d72-f4aa-4f21-bff3-6294e4ff45f2");
        work.setPeoplenum("200");
        work.setMoney("3000");
        work.setComname("重庆品胜科技有限公司");
        work.setBegandend("2018-07-16——至今");
        work.setWhy("你猜");
        work.setWitness("陈帅");
        System.out.println(interviewService.updateWork(work));
    }
    @Test
    public void insertIntoFamily() throws Exception{
        Family family = new Family();
        family.setUser_id("57bb2af9-72be-4dc2-89c4-ff2ab96f2576");
        family.setFamily_id(UUID.randomUUID().toString());
        family.setAddress("重庆市");
        family.setName("陈帅");
        family.setPhone("17749974957");
        family.setPost("软件开发工程师");
        family.setRelay("本人");
        family.setStatus("未婚");
        System.out.println(interviewService.insertIntoFamily(family));
    }
    @Test
    public void findPost() throws Exception{
        User user = new User();
        user.setUser_id("fdaf21ae-6266-47c5-865d-dfe0fa994c26");
        System.out.println(interviewService.findPost(user));
    }
    @Test
    public void findAssistentWrite() throws Exception{
        User user = new User();
        user.setUser_id("fdaf21ae-6266-47c5-865d-dfe0fa994c26");
        System.out.println(interviewService.findAssistentWrite(user));
    }
    @Test
    public void insertInotAss(){
        Assistent_answer assistent_answer = new Assistent_answer();
        assistent_answer.setUser_id("57bb2af9-72be-4dc2-89c4-ff2ab96f2576");
        assistent_answer.setAssans_id(UUID.randomUUID().toString());
        assistent_answer.setFirst_ans("123");
        assistent_answer.setSecond_ans("234");
        assistent_answer.setThird_ans("345");
        System.out.println(interviewService.insertInotAss(assistent_answer));
    }
    @Test
    public void insertInotOther(){
        Other_answer other_answer = new Other_answer();
        other_answer.setUser_id("57bb2af9-72be-4dc2-89c4-ff2ab96f2576");
        other_answer.setOthans_id(UUID.randomUUID().toString());
        other_answer.setFirst_ans("123");
        other_answer.setSecond_ans("234");
        System.out.println(interviewService.insertInotOther(other_answer));
    }
    @Test
    public void insertInotSale(){
        Sale_answer sale_answer = new Sale_answer();
        sale_answer.setUser_id("57bb2af9-72be-4dc2-89c4-ff2ab96f2576");
        sale_answer.setSaleans_id(UUID.randomUUID().toString());
        sale_answer.setFirst_ans("123");
        sale_answer.setSecond_ans("234");
        sale_answer.setThird_ans("345");
        sale_answer.setFourth_ans("456");
        System.out.println(interviewService.insertInotSale(sale_answer));
    }
    @Test
    public void uppdateSale() throws Exception{
        Sale_answer sale_answer = new Sale_answer();
        sale_answer.setUser_id("57bb2af9-72be-4dc2-89c4-ff2ab96f2576");
        sale_answer.setFirst_ans("1234567");
        sale_answer.setSecond_ans("234");
        sale_answer.setThird_ans("345");
        sale_answer.setFourth_ans("456");
        System.out.println(interviewService.updateSale(sale_answer));
    }
    @Test
    public void findCharacter() throws Exception{
        User user = new User();
        user.setUser_id("fdaf21ae-6266-47c5-865d-dfe0fa994c26");
        System.out.println(interviewService.findCharacter(user));
    }
    @Test
    public void insertIntoJP() throws Exception{
        Personality_JP_ans personality_jp_ans = new Personality_JP_ans();
        personality_jp_ans.setUser_id("fdaf21ae-6266-47c5-865d-dfe0fa994c26");
        personality_jp_ans.setJP_ans_id(UUID.randomUUID().toString());
       personality_jp_ans.setJP_id("第一题题目");
        personality_jp_ans.setJP_num("1");
        personality_jp_ans.setJP_a_ans("3");
        personality_jp_ans.setJP_b_ans("2");
        System.out.println(interviewService.insertIntoJP(personality_jp_ans));
    }
    @Test
    public void insertIntoEI() throws Exception{
        Personality_EI_ans personality_ei_ans = new Personality_EI_ans();
        personality_ei_ans.setUser_id("fdaf21ae-6266-47c5-865d-dfe0fa994c26");
        personality_ei_ans.setEI_ans_id(UUID.randomUUID().toString());
        personality_ei_ans.setEI_id("第一题题目");
        personality_ei_ans.setEI_num("5");
        personality_ei_ans.setEI_a_ans("3");
        personality_ei_ans.setEI_b_ans("2");
        System.out.println(interviewService.insertIntoEI(personality_ei_ans));
    }
    @Test
    public void insertIntoSN() throws Exception{
        Personality_SN_ans personality_sn_ans = new Personality_SN_ans();
        personality_sn_ans.setUser_id("fdaf21ae-6266-47c5-865d-dfe0fa994c26");
        personality_sn_ans.setSN_ans_id(UUID.randomUUID().toString());
        personality_sn_ans.setSN_id("第一题题目");
        personality_sn_ans.setSN_num("9");
        personality_sn_ans.setSN_a_ans("3");
        personality_sn_ans.setSN_b_ans("2");
        System.out.println(interviewService.insertIntoSN(personality_sn_ans));
    }
    @Test
    public void insertIntoTF() throws Exception{
        Personality_TF_ans personality_tf_ans = new Personality_TF_ans();
        personality_tf_ans.setUser_id("fdaf21ae-6266-47c5-865d-dfe0fa994c26");
        personality_tf_ans.setTF_ans_id(UUID.randomUUID().toString());
        personality_tf_ans.setTF_id("第一题题目");
        personality_tf_ans.setTF_num("17");
        personality_tf_ans.setTF_a_ans("3");
        personality_tf_ans.setTF_b_ans("2");
        System.out.println(interviewService.insertIntoTF(personality_tf_ans));
    }
    @Test
    public void updateTF() throws Exception{
        Personality_TF_ans personality_tf_ans = new Personality_TF_ans();
        personality_tf_ans.setUser_id("fdaf21ae-6266-47c5-865d-dfe0fa994c26");
        personality_tf_ans.setTF_a_ans("dada");
        personality_tf_ans.setTF_b_ans("dad");
        System.out.println(interviewService.updateTF(personality_tf_ans));
    }
    @Test
    public void findCharacterWrite() throws Exception{
        System.out.println(interviewService.findCharacterWrite());
    }
    //保存答案
    @Test
    public void findTeach() throws Exception{
        User user = new User();
        user.setUser_id("57bb2af9-72be-4dc2-89c4-ff2ab96f2576");
        System.out.println(interviewService.selectTeach(user));
    }
    @Test
    public void deleteTeach() throws Exception{
        User user = new User();
        user.setUser_id("57bb2af9-72be-4dc2-89c4-ff2ab96f2576");
        System.out.println(interviewService.deleteTeach(user));
    }
    @Test
    public void deleteFamily() throws Exception{
        User user = new User();
        user.setUser_id("1ea5f7ba-5856-4478-9ee3-58bb4c9c39c9");
        System.out.println(interviewService.deleteFamily(user));
    }

    @Test
    public void updateTeach() throws Exception{
        List<Integer> num = new ArrayList<Integer>();
        Teach[] teaches = new Teach[3];
        teaches[0] = new Teach();
        teaches[1] = new Teach();
        teaches[2] = new Teach();
        teaches[0].setSchoole("重邮电2");
        teaches[1].setSchoole("重邮2");
        User user = new User();
        user.setUser_id("57bb2af9-72be-4dc2-89c4-ff2ab96f2576");
        interviewService.deleteTeach(user);
        for (int i = 0;i < 2; i++){
            String user_id = user.getUser_id();
            teaches[i].setUser_id(user_id);
            teaches[i].setTeach_id(UUID.randomUUID().toString());
            Integer n = interviewService.insertIntoTeach(teaches[i]);
            num.add(n);
        }
        System.out.println(num);
    }


}
