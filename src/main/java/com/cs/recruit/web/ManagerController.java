package com.cs.recruit.web;

import com.cs.recruit.dto.*;
import com.cs.recruit.entity.*;
import com.cs.recruit.service.HumanService;
import com.cs.recruit.service.InterviewService;
import com.cs.recruit.service.ManagerService;
import com.cs.recruit.util.JWT;
import jdk.nashorn.internal.scripts.JO;
import org.junit.runners.Parameterized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by asus on 2018/8/16.
 */
@Controller
@RequestMapping(value = "/manage")
@EnableSwagger2
public class ManagerController {
    @Autowired
    private ManagerService managerService;
    @Autowired
    private HumanService humanService;
    @Autowired
    private InterviewService interviewService;
    //查看所有已通过
    @RequestMapping(value = "/findPostInterview", produces = "application/json;charset=utf-8")
    public @ResponseBody List<listDto> findPostInterview(HttpServletRequest request) {
        String token = request.getParameter("token");
        JobDto jobDto = JWT.unsign(token, JobDto.class);
        System.out.println("---------------------------findPostInterview-------------------------");
        if (jobDto == null) {
            System.out.println("---------------------------findPostInterview---- 1 ------------------------");
            return null;
        } else {
            System.out.println("---------------------------findPostInterview---- 2  ---------------------");
            System.out.println(jobDto.toString());
            String dept_id = jobDto.getDept_id().getDept_id();
            return managerService.findInterview2(dept_id);
        }

    }
    @RequestMapping(value = "/findDetails",produces = "application/json;charset=utf-8")
    public @ResponseBody DetailsDto findDetails(User user){
        return managerService.findDetails(user);
    }
    @RequestMapping(value = "/findEvalute",produces = "application/json;charset=utf-8")
    public @ResponseBody EvaluateDto findEvaluate(User user){
        return managerService.findEvaluate(user);
    }
    @RequestMapping(value = "/updateEvalute",produces = "application/json;charset=utf-8")
    public @ResponseBody EvaluateDto updateEvalute(User user,EvaluateDto evaluateDto){
        managerService.UpdateEvaluate(evaluateDto);
        return managerService.findEvaluate(user);
    }
    //更新用户状态
    @RequestMapping(value = "/updateUser",produces = "application/json;charset=utf-8")
    public @ResponseBody int updateUser(EvaluateDto evaluateDto){
        String user_id = evaluateDto.getUser_id();
        Employ employ = evaluateDto.getEmploy();
        String colligate = employ.getColligate();
        String manager = employ.getManager();
        if (colligate.equals("录用") && manager.equals("录用")){
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
        return managerService.findPost(user);
    }
    //查询答案
    @RequestMapping(value = "/findAssAnswer",produces = "application/json;charset=utf-8")
    public @ResponseBody
    Assistent_answer findAssAnswer(User user){
        return interviewService.findAssistentWrite(user);
    }
    @RequestMapping(value = "/findSaleAnswer",produces = "application/json;charset=utf-8")
    public @ResponseBody
    Sale_answer findSaleAnswer(User user){
        return interviewService.findSaleWrite(user);
    }
    @RequestMapping(value = "/findOtherAnswer",produces = "application/json;charset=utf-8")
    public @ResponseBody Other_answer findOtherAnswer(User user){
        return  interviewService.findOtherWrite(user);
    }
}

