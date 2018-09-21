package com.cs.recruit.web;

import com.cs.recruit.dto.*;
import com.cs.recruit.entity.*;
import com.cs.recruit.service.HumanService;
import com.cs.recruit.service.InterviewService;
import com.cs.recruit.service.JobService;
import com.cs.recruit.service.ManagerService;
import com.cs.recruit.util.JWT;
import com.cs.recruit.util.ResponseData;
import com.sun.org.apache.bcel.internal.generic.LUSHR;
import jdk.nashorn.internal.scripts.JO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * Created by asus on 2018/8/16.
 */
@Controller
@RequestMapping(value = "/human")
@EnableSwagger2
public class HumanController {
    @Autowired
    private HumanService humanService;
    @Autowired
    private JobService jobService;
    @Autowired
    private InterviewService interviewService;
    @Autowired
    private ManagerService managerService;
    @RequestMapping(value = "/login",produces = "application/json;charset=utf-8")
    public @ResponseBody ResponseData login(HttpServletRequest request, Job job){
        if (jobService.findJobByUserAndPassword(job) != null){
            ResponseData responseData = ResponseData.ok();
            responseData.putDataValue("job",jobService.findJobByUserAndPassword(job));
            String token = JWT.sign(jobService.findJobByUserAndPassword(job),30L * 24L * 3600L * 1000L);
            if (token != null){
                responseData.putDataValue("token",token);
            }
            return responseData;
        }
        return ResponseData.serverInternalError();
    }
    //查看已经被部门主管驳回的人
    @RequestMapping(value = "/findDefalt",produces = "application/json;charset=utf-8")
    public @ResponseBody List<InterviewDto> findDefault(){
        return humanService.findInterviewun();
    }
    //查看应聘相应职位的面试者
    @RequestMapping(value = "/findPostInterview",produces = "application/json;charset=utf-8")
    public @ResponseBody List<listDto> findPostInterview(String post){
        System.out.println(post);
        return humanService.findInterview(post);
    }
    //查看面试者详情
    @RequestMapping(value = "/findDetails",produces = "application/json;charset=utf-8")
    public @ResponseBody DetailsDto findDetails(User user){
        String user_id = user.getUser_id();
        System.out.println(user_id);
        return humanService.findDetails(user);
    }
    //进行部门分配
    @RequestMapping(value = "/DeptAllot",produces = "application/json;charset=utf-8")
    public @ResponseBody int DeptAllot(String dept_id,User user){
        String user_id = user.getUser_id();
        HashMap hashMap = new HashMap();
        hashMap.put("user_id",user_id);
        hashMap.put("dept_id",dept_id);
        return humanService.updataDept(hashMap);
    }
    //查看面试评价表
    @RequestMapping(value = "/findEvalute",produces = "application/json;charset=utf-8")
    public @ResponseBody EvaluateDto findEvaluate(User user){
        return humanService.findEvaluate(user);
}
    //创建面试评价表
    @RequestMapping(value = "/createEvalute",produces = "application/json;charset=utf-8")
    public @ResponseBody EvaluateDto createEvalute(User user){
        EvaluateDto evaluateDto = new EvaluateDto();
        String user_id = user.getUser_id();
        String rale_name = user.getUser_name();
        String post = interviewService.findPost(user);
        String dept_id = humanService.selectDept(user);
        String evaluate_id = UUID.randomUUID().toString();
        evaluateDto.setEvaluate_id(evaluate_id);
        evaluateDto.setDept_id(dept_id);
        evaluateDto.setRale_name(rale_name);
        evaluateDto.setPost(post);
        evaluateDto.setUser_id(user_id);
        evaluateDto.setFirsttry_id(UUID.randomUUID().toString());
        evaluateDto.setEvaluate_id(evaluate_id);
        evaluateDto.setSecondtry_id(UUID.randomUUID().toString());
        evaluateDto.setEvaluate_id(evaluate_id);
        evaluateDto.setEmploy_id(UUID.randomUUID().toString());
        evaluateDto.setEvaluate_id(evaluate_id);
        humanService.createEvalute(evaluateDto);
        humanService.createFirsttry(evaluateDto);
        humanService.createSecondtry(evaluateDto);
        humanService.createEmploy(evaluateDto);
        return humanService.findEvaluate(user);
    }
    //更新面试评价表
    @RequestMapping(value = "/updateEvalute",produces = "application/json;charset=utf-8")
    public @ResponseBody EvaluateDto updateEvalute(User user,EvaluateDto evaluateDto){
        humanService.UpdateEvaluate(evaluateDto);
        String user_id  = evaluateDto.getUser_id();
        String first_colligate = evaluateDto.getFirst_colligate();
        String second_colligate = evaluateDto.getSecond_colligate();
        String colligate = evaluateDto.getColligate();
        String manager = evaluateDto.getManager();
        if (first_colligate.equals("不通过")){
            humanService.updateFirstNo(user_id);
        }
        if (first_colligate.equals("通过") && second_colligate == null && colligate == null && manager ==null){
            humanService.updateFirstYes(user_id);
        }
        if (first_colligate.equals("通过") && second_colligate.equals("不通过")){
            humanService.updateSecondNo(user_id);
        }
        if (first_colligate.equals("通过") && second_colligate.equals("通过") && colligate == null && manager == null){
            humanService.updateSecondYes(user_id);
        }
        if (first_colligate.equals("通过") && second_colligate.equals("通过") && colligate.equals("通过") && manager.equals("通过")){
            humanService.updateEmployYes(user_id);
        }else {
            humanService.updateEmployNo(user_id);
        }
        return humanService.findEvaluate(user);
    }
    //更新用户状态
    @RequestMapping(value = "/updateUser",produces = "application/json;charset=utf-8")
    public @ResponseBody int updateUser(EvaluateDto evaluateDto){
        String user_id  = evaluateDto.getUser_id();
        String first_colligate = evaluateDto.getFirst_colligate();
        String second_colligate = evaluateDto.getSecond_colligate();
        String colligate = evaluateDto.getColligate();
        String manager = evaluateDto.getManager();
        if (first_colligate.equals("不通过")){
            return humanService.updateFirstNo(user_id);
        }
        if (first_colligate.equals("通过") && second_colligate == null){
            return humanService.updateFirstYes(user_id);
        }
        if (first_colligate.equals("通过") && second_colligate.equals("不通过")){
            return humanService.updateSecondNo(user_id);
        }
        if (first_colligate.equals("通过") && second_colligate.equals("通过") && colligate == null && manager == null){
            return humanService.updateSecondYes(user_id);
        }
        if (first_colligate.equals("通过") && second_colligate.equals("通过") && colligate.equals("通过") && manager.equals("通过")){
            return humanService.updateEmployYes(user_id);
        }else {
            return humanService.updateEmployNo(user_id);
        }
    }

    //显示题目
    @RequestMapping(value = "/AssSubject",produces = "application/json;charset=utf-8")
    public @ResponseBody Assistent_subject findAssSubject(){
        return interviewService.findAssSubject();
    }
    @RequestMapping(value = "/SaleSubject",produces = "application/json;charset=utf-8")
    public @ResponseBody Sale_subject findSaleSubject(){
        return interviewService.findSaleSubject();
    }
    @RequestMapping(value = "/OtherSubject",produces = "application/json;charset=utf-8")
    public @ResponseBody Other_subject findOtherSubject(){
        return interviewService.findOtherSubject();
    }
    //查询职位
    @RequestMapping(value = "/post",produces = "application/json;charset=utf-8")
    public @ResponseBody String findPost(User user){
        String post = managerService.findPost(user);
        return post;
    }
    //查询答案
    @RequestMapping(value = "/findAnswer",produces = "application/json;charset=utf-8")
    public @ResponseBody Object findAssAnswer(User user){
        String post = interviewService.findPost(user);
        if (post == "商务助理"){
            Assistent_answer assistent_answer = new Assistent_answer();
            AssistentWriteDto assistentWriteDto = new AssistentWriteDto();
            Assistent_subject assistent_subject = new Assistent_subject();
            assistent_subject = interviewService.findAssSubject();
            assistent_answer = interviewService.findAssistentWrite(user);
            assistentWriteDto.setAssistent_answer(assistent_answer);
            assistentWriteDto.setAssistent_subject(assistent_subject);
            return assistentWriteDto;
        }if (post == "区域销售"){
            Sale_subject sale_subject = new Sale_subject();
            Sale_answer sale_answer = new Sale_answer();
            SaleWriteDto saleWriteDto = new SaleWriteDto();
            sale_answer = interviewService.findSaleWrite(user);
            sale_subject = interviewService.findSaleSubject();
            saleWriteDto.setSale_subject(sale_subject);
            saleWriteDto.setSale_answer(sale_answer);
            return saleWriteDto;
        }else{
            Other_subject other_subject = new Other_subject();
            Other_answer other_answer = new Other_answer();
            OtherWriteDto otherWriteDto = new OtherWriteDto();
            other_subject = interviewService.findOtherSubject();
            other_answer = interviewService.findOtherWrite(user);
            otherWriteDto.setOther_answer(other_answer);
            otherWriteDto.setOther_subject(other_subject);
            return  otherWriteDto;
        }
    }
    @RequestMapping(value = "/findSaleAnswer",produces = "application/json;charset=utf-8")
    public @ResponseBody Sale_answer findSaleAnswer(User user){
        return interviewService.findSaleWrite(user);
    }
    @RequestMapping(value = "/findOtherAnswer",produces = "application/json;charset=utf-8")
    public @ResponseBody Other_answer findOtherAnswer(User user){
        return  interviewService.findOtherWrite(user);
    }
    //查询性格测试
    @RequestMapping(value = "/selectResult",produces = "application/json;charset=utf-8")
    public @ResponseBody Result selectResult(User user){
        return interviewService.selectResult(user);
    }
}
