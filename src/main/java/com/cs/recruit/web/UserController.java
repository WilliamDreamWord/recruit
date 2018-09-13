package com.cs.recruit.web;


import com.alibaba.fastjson.JSONArray;
import com.auth0.jwt.internal.org.bouncycastle.jcajce.provider.symmetric.TEA;
import com.cs.recruit.dto.CWDto;
import com.cs.recruit.dto.CharacterWriteDto;
import com.cs.recruit.entity.*;
import com.cs.recruit.service.InterviewService;
import com.cs.recruit.service.ManagerService;
import com.cs.recruit.service.UserService;
import com.cs.recruit.util.JWT;
import com.cs.recruit.util.ResponseData;
import io.protostuff.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by asus on 2018/8/15.
 */
@Controller
@RequestMapping(value = "/user")
@EnableSwagger2
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private InterviewService interviewService;
    @Autowired
    private ManagerService managerService;
    //登录
    @RequestMapping(value = "/login", produces = "application/json;charset=utf-8")
    public @ResponseBody ResponseData login(HttpServletRequest request, User user) {
        String token1 = request.getParameter("token");
        System.out.println(token1);
        if (userService.findByUserAndCard(user) != null) {
            ResponseData responseData = ResponseData.ok();
            responseData.putDataValue("user", userService.findByUserAndCard(user));
            String token = JWT.sign(userService.findByUserAndCard(user), 30L * 24L * 3600L * 1000L);
            if (token != null) {
                responseData.putDataValue("token", token);
            }
            return responseData;
        } else {
            user.setUser_id(UUID.randomUUID().toString());
            user.setUser_status("0");
            int b = userService.insert(user);
            if (b > 0) {
                ResponseData responseData = ResponseData.ok();
                responseData.putDataValue("user", user);
                String token = JWT.sign(user, 30L * 24L * 3600L * 1000L);
                if (token != null) {
                    responseData.putDataValue("token", token);
                }
                return responseData;
            }
        }
       return ResponseData.serverInternalError();
    }
    @RequestMapping(value = "/findApply",produces = "application/json;charset=utf-8")
    public @ResponseBody Apply findApply(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        return interviewService.selectApply(user);
    }
    @RequestMapping(value = "/updateApply",produces = "application/json;charst=utf-8")
    public @ResponseBody int insetApply(HttpServletRequest request,Apply apply){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        if (interviewService.selectApply(user) == null){
            String user_id = user.getUser_id();
            apply.setUser_id(user_id);
            apply.setApply_id(UUID.randomUUID().toString());
            return interviewService.insertIntoApply(apply);
        }else {
            String user_id = user.getUser_id();
            apply.setUser_id(user_id);
            return  interviewService.updateApply(apply);
        }
    }
    @RequestMapping(value = "/findBase",produces = "application/json;charset=utf-8")
    public @ResponseBody Base findBase(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        return interviewService.selectBase(user);
    }
    @RequestMapping(value = "/updateBase",produces = "application/json;charset=utf-8")
    public @ResponseBody int insertBase(HttpServletRequest request,Base base){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        if (interviewService.selectBase(user) == null){
            String user_id = user.getUser_id();
            base.setUser_id(user_id);
            base.setBase_id(UUID.randomUUID().toString());
            return interviewService.insertIntoBase(base);
        }else {
            String user_id = user.getUser_id();
            base.setUser_id(user_id);
            return interviewService.updateBase(base);
        }
    }
    @RequestMapping(value = "/findTeache",produces = "application/json;charset=utf-8")
    public @ResponseBody List<Teach> findTeach(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        return interviewService.selectTeach(user);
    }
    @RequestMapping(value = "/updateTeach",produces = "application/json;charset=utf-8")
    public @ResponseBody List<Integer> insertTeach(HttpServletRequest request){
        List<Integer> num = new ArrayList<Integer>();
        String token = request.getParameter("token");
        String json = request.getParameter("teachs");
        User user = JWT.unsign(token,User.class);
        interviewService.deleteTeach(user);
        String user_id = user.getUser_id();
        JSONArray jsonArray = JSONArray.parseArray(json);
        ArrayList<Teach> teaches = new ArrayList<Teach>();
        for (int i = 0; i < jsonArray.size(); i++){
            Teach teach = new Teach();
            teach.setUser_id(user_id);
            teach.setTeach_id(UUID.randomUUID().toString());
            teach.setSchoole(jsonArray.getJSONObject(i).getString("schoole"));
            teach.setRecord(jsonArray.getJSONObject(i).getString("record"));
            teach.setMajor(jsonArray.getJSONObject(i).getString("major"));
            teach.setBegandend(jsonArray.getJSONObject(i).getString("begandend"));
            teaches.add(teach);
        }
        for (Teach teach:teaches){
            Integer n = interviewService.insertIntoTeach(teach);
            num.add(n);
        }
        return num;
    }
    @RequestMapping(value = "/findWork",produces = "application/json;charset=utf-8")
    public @ResponseBody List<Work> findWork(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        return interviewService.selectWork(user);
    }
    @RequestMapping(value = "/findFamily",produces = "application/json;charset=utf-8")
    public @ResponseBody List<Family> findFamily(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        return interviewService.selectFamily(user);
    }
    @RequestMapping(value = "/updateWork",produces = "application/json;charset=utf-8")
    public @ResponseBody List<Integer> insertWork(HttpServletRequest request){
        List<Integer> num = new ArrayList<Integer>();
        String token = request.getParameter("token");
        String json = request.getParameter("works");
        User user = JWT.unsign(token,User.class);
        interviewService.deleteWork(user);
        String user_id = user.getUser_id();
        JSONArray jsonArray = JSONArray.parseArray(json);
        System.out.println(jsonArray.toArray().toString()+"ssssssssssssssssssssssssssssssssssssssssssssss");
        ArrayList<Work> works = new ArrayList<Work>();
        for (int i = 0; i < jsonArray.size(); i++){
            Work work = new Work();
            work.setUser_id(user_id);
            work.setWork_id(UUID.randomUUID().toString());
            work.setWitness(jsonArray.getJSONObject(i).getString("witness"));
            work.setWhy(jsonArray.getJSONObject(i).getString("why"));
            work.setBegandend(jsonArray.getJSONObject(i).getString("begandend"));
            work.setComname(jsonArray.getJSONObject(i).getString("comname"));
            work.setPost(jsonArray.getJSONObject(i).getString("post"));
            work.setMoney(jsonArray.getJSONObject(i).getString("money"));
            work.setPeoplenum(jsonArray.getJSONObject(i).getString("peoplenum"));
            works.add(work);
        }
        for (Work work:works){
            Integer n = interviewService.insertIntoWork(work);
            num.add(n);
        }
        return num;
    }
    @RequestMapping(value = "/updateFamily",produces = "application/json;charset=utf-8")
    public @ResponseBody List<Integer> insertFamily(HttpServletRequest request){
        List<Integer> num = new ArrayList<Integer>();
        String token = request.getParameter("token");
        String json = request.getParameter("familys");
        User user = JWT.unsign(token,User.class);
        interviewService.deleteFamily(user);
        String user_id = user.getUser_id();
        JSONArray jsonArray = JSONArray.parseArray(json);
        ArrayList<Family> families = new ArrayList<Family>();
        for (int i = 0; i < jsonArray.size(); i++){
            Family family = new Family();
            family.setUser_id(user_id);
            family.setFamily_id(UUID.randomUUID().toString());
            family.setStatus(jsonArray.getJSONObject(i).getString("status"));
            family.setRelay(jsonArray.getJSONObject(i).getString("relay"));
            family.setPost(jsonArray.getJSONObject(i).getString("post"));
            family.setPhone(jsonArray.getJSONObject(i).getString("phone"));
            family.setName(jsonArray.getJSONObject(i).getString("name"));
            family.setAddress(jsonArray.getJSONObject(i).getString("address"));
            families.add(family);
        }
        for (Family family:families){
            Integer n = interviewService.insertIntoFamily(family);
            num.add(n);
        }
        return num;
    }
    //笔试
    //显示题目
    @RequestMapping(value = "/AssSubject",produces = "application/json;charset=utf-8")
    public @ResponseBody Assistent_subject findAssSubject(HttpServletRequest request){
        return interviewService.findAssSubject();
    }
    @RequestMapping(value = "/SaleSubject",produces = "application/json;charset=utf-8")
    public @ResponseBody Sale_subject findSaleSubject(HttpServletRequest request){
        return interviewService.findSaleSubject();
    }
    @RequestMapping(value = "/OtherSubject",produces = "application/json;charset=utf-8")
    public @ResponseBody Other_subject findOtherSubject(HttpServletRequest request){
        return interviewService.findOtherSubject();
    }
    //查询职位
    @RequestMapping(value = "/post",produces = "application/json;charset=utf-8")
    public @ResponseBody String findPost(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        String post = managerService.findPost(user);
        return post;
    }
    //保存答案
    @RequestMapping(value = "/AssAnswer",produces = "application/json;charset=utf-8")
    public @ResponseBody int insertAssAnswer(HttpServletRequest request,Assistent_answer assistent_answer){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        String user_id = user.getUser_id();
        assistent_answer.setUser_id(user_id);
        assistent_answer.setAssans_id(UUID.randomUUID().toString());
        System.out.println(assistent_answer);
        return interviewService.insertInotAss(assistent_answer);
    }
    @RequestMapping(value = "/updateAssAnswer",produces = "application/json;charset=utf-8")
    public @ResponseBody int updateAssAnswer(HttpServletRequest request, Assistent_answer assistent_answer){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        String user_id = user.getUser_id();
        assistent_answer.setUser_id(user_id);
        return interviewService.updateAss(assistent_answer);
    }
    @RequestMapping(value = "/SaleAnswer",produces = "application/json;charset=utf-8")
    public @ResponseBody int insertSaleAnswer(HttpServletRequest request,Sale_answer sale_answer){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        String user_id = user.getUser_id();
        sale_answer.setUser_id(user_id);
        sale_answer.setSaleans_id(UUID.randomUUID().toString());
        return interviewService.insertInotSale(sale_answer);
    }
    @RequestMapping(value = "/updateSaleAnswer",produces = "application/json;charset=utf-8")
    public @ResponseBody int updateSaleAnswer(HttpServletRequest request,Sale_answer sale_answer){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        String user_id = user.getUser_id();
        sale_answer.setUser_id(user_id);
        return interviewService.updateSale(sale_answer);
    }
    @RequestMapping(value = "/OtherAnswer",produces = "application/json;charset=utf-8")
    public @ResponseBody int insertOtherAnswer(HttpServletRequest request,Other_answer other_answer){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        String user_id = user.getUser_id();
        other_answer.setUser_id(user_id);
        other_answer.setOthans_id(UUID.randomUUID().toString());
        return interviewService.insertInotOther(other_answer);
    }
    @RequestMapping(value = "/updateOtherAnswer",produces = "application/json;charset=utf-8")
    public @ResponseBody int updateOtherAnswer(HttpServletRequest request,Other_answer other_answer){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        String user_id = user.getUser_id();
        other_answer.setUser_id(user_id);
        return interviewService.updateOther(other_answer);
    }
    //查询答案
    @RequestMapping(value = "/findAssAnswer",produces = "application/json;charset=utf-8")
    public @ResponseBody Assistent_answer findAssAnswer(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        return interviewService.findAssistentWrite(user);
    }
    @RequestMapping(value = "/findSaleAnswer",produces = "application/json;charset=utf-8")
    public @ResponseBody Sale_answer findSaleAnswer(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        return interviewService.findSaleWrite(user);
    }
    @RequestMapping(value = "/findOtherAnswer",produces = "application/json;charset=utf-8")
    public @ResponseBody Other_answer findOtherAnswer(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        return  interviewService.findOtherWrite(user);
    }
    //性格测试
    //查询题目
    @RequestMapping(value = "/findCharacter",produces = "application/json;charset=utf-8")
    public @ResponseBody List<CWDto> findCharacter(HttpServletRequest request){
        return interviewService.findCharacterWrite();
    }
    //查询答案
    @RequestMapping(value = "/findCharacterAnswer",produces = "application/json;charset=utf-8")
    public @ResponseBody CharacterWriteDto findCharacterAnswer(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        return interviewService.findCharacter(user);
    }
    //插入ei类型答案
    @RequestMapping(value = "/insertEI",produces = "application/json;charset=utf-8")
    public @ResponseBody List<Integer> insertEI(HttpServletRequest request){
        List<Integer> num = new ArrayList<Integer>();
        String token = request.getParameter("token");
        String json = request.getParameter("personality_ei_ansList");
        User user = JWT.unsign(token,User.class);
        String user_id = user.getUser_id();
        JSONArray jsonArray = JSONArray.parseArray(json);
        ArrayList<Personality_EI_ans> personality_ei_ansArrayList = new ArrayList<Personality_EI_ans>();
        for (int i = 0; i < jsonArray.size(); i++){
            Personality_EI_ans personality_ei_ans = new Personality_EI_ans();
            personality_ei_ans.setUser_id(user_id);
            personality_ei_ans.setEI_ans_id(UUID.randomUUID().toString());
            personality_ei_ans.setEI_a_ans(jsonArray.getJSONObject(i).getString("EI_a_ans"));
            personality_ei_ans.setEI_id(jsonArray.getJSONObject(i).getString("EI_id"));
            personality_ei_ans.setEI_b_ans(jsonArray.getJSONObject(i).getString("EI_b_ans"));
            personality_ei_ans.setEI_num(jsonArray.getJSONObject(i).getString("EI_num"));
            personality_ei_ansArrayList.add(personality_ei_ans);
        }
        for (Personality_EI_ans personality_ei_ans:personality_ei_ansArrayList){
            Integer n = interviewService.insertIntoEI(personality_ei_ans);
            num.add(n);
        }
        return num;
    }
    //插入SN类型答案
    @RequestMapping(value = "/insertSN",produces = "application/json;charset=utf-8")
    public @ResponseBody List<Integer> insertSN(HttpServletRequest request){
        List<Integer> num = new ArrayList<Integer>();
        String token = request.getParameter("token");
        String json = request.getParameter("personality_sn_ansArrayList");
        User user = JWT.unsign(token,User.class);
        String user_id = user.getUser_id();
        JSONArray jsonArray = JSONArray.parseArray(json);
        ArrayList<Personality_SN_ans> personality_sn_ansArrayList = new ArrayList<Personality_SN_ans>();
        for (int i = 0; i < personality_sn_ansArrayList.size(); i++){
            Personality_SN_ans personality_sn_ans = new Personality_SN_ans();
            personality_sn_ans.setUser_id(user_id);
            personality_sn_ans.setSN_ans_id(UUID.randomUUID().toString());
            personality_sn_ans.setSN_a_ans(jsonArray.getJSONObject(i).getString("SN_a_ans"));
            personality_sn_ans.setSN_b_ans(jsonArray.getJSONObject(i).getString("SN_b_ans"));
            personality_sn_ans.setSN_id(jsonArray.getJSONObject(i).getString("SN_id"));
            personality_sn_ans.setSN_num(jsonArray.getJSONObject(i).getString("SN_num"));
            personality_sn_ansArrayList.add(personality_sn_ans);
        }
        for (Personality_SN_ans personality_sn_ans:personality_sn_ansArrayList){
            Integer n = interviewService.insertIntoSN(personality_sn_ans);
            num.add(n);
        }
        return num;
    }
   //插入jp类型答案
    @RequestMapping(value = "/insertJP",produces = "application/json;charset=utf-8")
    public @ResponseBody List<Integer> insertJP(HttpServletRequest request){
        List<Integer> num = new ArrayList<Integer>();
        ArrayList<Personality_JP_ans> personality_jp_ansArrayList = new ArrayList<Personality_JP_ans>();
        String token = request.getParameter("token");
        String json = request.getParameter("personality_jp_ansArrayList");
        User user = JWT.unsign(token,User.class);
        String user_id = user.getUser_id();
        JSONArray jsonArray = JSONArray.parseArray(json);
        for (int i = 0; i < jsonArray.size(); i++){
            Personality_JP_ans personality_jp_ans = new Personality_JP_ans();
            personality_jp_ans.setUser_id(user_id);
            personality_jp_ans.setJP_ans_id(UUID.randomUUID().toString());
            personality_jp_ans.setJP_b_ans(jsonArray.getJSONObject(i).getString("JP_b_ans"));
            personality_jp_ans.setJP_a_ans(jsonArray.getJSONObject(i).getString("JP_a_ans"));
            personality_jp_ans.setJP_num(jsonArray.getJSONObject(i).getString("JP_num"));
            personality_jp_ans.setJP_id(jsonArray.getJSONObject(i).getString("JP_id"));
            personality_jp_ansArrayList.add(personality_jp_ans);
        }
        for (Personality_JP_ans personality_jp_ans:personality_jp_ansArrayList){
            Integer n = interviewService.insertIntoJP(personality_jp_ans);
            num.add(n);
        }
        return num;
    }
    @RequestMapping(value = "/insertTF",produces = "aoolication/json;charset=utf-8")
    public @ResponseBody List<Integer> insertTF(HttpServletRequest request){
        List<Integer> num = new ArrayList<Integer>();
        ArrayList<Personality_TF_ans> personality_tf_ansArrayList = new ArrayList<Personality_TF_ans>();
        String token = request.getParameter("token");
        String json = request.getParameter("personality_tf_ansArrayList");
        User user = JWT.unsign(token,User.class);
        JSONArray jsonArray = JSONArray.parseArray(json);
        String user_id = user.getUser_id();
        for (int i = 0; i < personality_tf_ansArrayList.size(); i++){
            Personality_TF_ans personality_tf_ans = new Personality_TF_ans();
            personality_tf_ans.setUser_id(user_id);
            personality_tf_ans.setTF_ans_id(UUID.randomUUID().toString());
            personality_tf_ans.setTF_a_ans(jsonArray.getJSONObject(i).getString("TF_a_ans"));
            personality_tf_ans.setTF_b_ans(jsonArray.getJSONObject(i).getString("TF_b_ans"));
            personality_tf_ans.setTF_id(jsonArray.getJSONObject(i).getString("TF_if"));
            personality_tf_ans.setTF_num(jsonArray.getJSONObject(i).getString("TF_num"));
            personality_tf_ansArrayList.add(personality_tf_ans);
        }
        for (Personality_TF_ans personality_tf_ans:personality_tf_ansArrayList){
            Integer n = interviewService.insertIntoTF(personality_tf_ans);
            num.add(n);
        }
        return num;
    }

    //插入自己的评价
    @RequestMapping(value = "/insertCharacterSum",produces = "application/json;charset=utf-8")
    public @ResponseBody int insertCharacterSum(HttpServletRequest request,Face face){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        face.setUser_id(user.getUser_id());
        face.setFace_id(UUID.randomUUID().toString());
        return interviewService.insertIntoFace(face);
    }

    //查找性格测试最后类型
    @RequestMapping(value = "/findSum",produces = "application/json;charset=utf-8")
    public @ResponseBody String findSum(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        StringBuilder stringBuilder = new StringBuilder();
        int e = Integer.parseInt(interviewService.SumE(user));
        int i = Integer.parseInt(interviewService.SumI(user));
        int j = Integer.parseInt(interviewService.SumJ(user));
        int p = Integer.parseInt(interviewService.SumP(user));
        int s = Integer.parseInt(interviewService.SumS(user));
        int n = Integer.parseInt(interviewService.SumN(user));
        int t = Integer.parseInt(interviewService.SumT(user));
        int f = Integer.parseInt(interviewService.SumF(user));
        if (e > i){
            stringBuilder.append("E");
        }else {
            stringBuilder.append("I");
        }if (j > p){
            stringBuilder.append("J");
        }else{
            stringBuilder.append("P");
        }if (s > n){
            stringBuilder.append("S");
        }else {
            stringBuilder.append("N");
        }if (t > f){
            stringBuilder.append("T");
        }else{
            stringBuilder.append("F");
        }
        String f_result = stringBuilder.toString();
        return f_result;
    }
    //查找e类型分数
    @RequestMapping(value = "/findE",produces = "application/json;charset=utf-8")
    public @ResponseBody String findE(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        return interviewService.SumE(user);
    }
    @RequestMapping(value = "/findI",produces = "application/json;charset=utf-8")
    public @ResponseBody String findI(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        return interviewService.SumI(user);
    }
    @RequestMapping(value = "/findJ",produces = "application/json;charset=utf-8")
    public @ResponseBody String findJ(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        return interviewService.SumJ(user);
    }
    @RequestMapping(value = "/findP",produces = "application/json;charset=utf-8")
    public @ResponseBody String findP(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        return interviewService.SumP(user);
    }
    @RequestMapping(value = "/findS",produces = "application/json;charset=utf-8")
    public @ResponseBody String findS(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        return interviewService.SumS(user);
    }
    @RequestMapping(value = "/findN",produces = "application/json;charset=utf-8")
    public @ResponseBody String findN(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        return interviewService.SumN(user);
    }
    @RequestMapping(value = "/findT",produces = "application/json;charset=utf-8")
    public @ResponseBody String findT(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        return interviewService.SumT(user);
    }
    @RequestMapping(value = "/findF",produces = "application/json;charset=utf-8")
    public @ResponseBody String findF(HttpServletRequest request){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        return interviewService.SumF(user);
    }

    //插入性格测试结果
    @RequestMapping(value = "/insertResult",produces = "application/json;charset=utf-8")
    public @ResponseBody int insertResult(HttpServletRequest request,Result result){
        String token = request.getParameter("token");
        User user = JWT.unsign(token,User.class);
        String user_id = user.getUser_id();
        result.setUser_id(user_id);
        result.setResult_id(UUID.randomUUID().toString());
        return interviewService.insertResult(result);
    }
}