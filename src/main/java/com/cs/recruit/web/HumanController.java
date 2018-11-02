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
import java.util.Map;
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
        ResponseData responseData = ResponseData.ok();
        if (jobService.findJobByUserAndPassword(job) != null){
            responseData.putDataValue("job",jobService.findJobByUserAndPassword(job));
            String token = JWT.sign(jobService.findJobByUserAndPassword(job),30L * 24L * 3600L * 1000L);
            if (token != null){
                responseData.putDataValue("token",token);
            }
            return responseData;
        } else {
            responseData.putDataValue("job", jobService.findJobByUserAndPassword(job));
            return responseData;
        }
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
    //查看所有应届生
    @RequestMapping(value = "/findStuInterview",produces = "application/json;charset=utf-8")
    public @ResponseBody List<listDto> findStuInterview() {
        return humanService.findStuInterview();
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
    public @ResponseBody int DeptAllot(String dept_id,String user_id){
        System.out.println(user_id);
        HashMap hashMap = new HashMap();
        hashMap.put("user_id",user_id);
        hashMap.put("dept_id",dept_id);
        return humanService.updataDept(hashMap);
    }
    //查看面试评价表
    @RequestMapping(value = "/findEvalute",produces = "application/json;charset=utf-8")
    public @ResponseBody EvaluateDto findEvaluate(User user){
        System.out.println("-----------------------------findEvalute---------------------------");
        System.out.println(user.getUser_id());
        return humanService.findEvaluate(user.getUser_id());
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
        return humanService.findEvaluate(user.getUser_id());
    }

    //更新面试评价表
//    @RequestMapping(value = "/updateEvalute",produces = "application/json;charset=utf-8")
//    public @ResponseBody EvaluateDto updateEvalute(EvaluateDto evaluateDto){
//        System.out.println("---------------------------------------updateEvaluate--- 1  ------------------------------");
//        System.out.println(evaluateDto.getFirst_colligate_text() + "  " + evaluateDto.getFirst_colligate());
//        humanService.UpdateEvaluate(evaluateDto);
//        String user_id  = evaluateDto.getUser_id();
//        String first_colligate = evaluateDto.getFirst_colligate();
//        String second_colligate = evaluateDto.getSecond_colligate();
//        String colligate = evaluateDto.getColligate();  //部门经理面试结果
//        String manager = evaluateDto.getManager();  //人力最终决定结果
//        System.out.println("---------------------------------------updateEvaluate----- 2  ----------------------------");
//        System.out.println(user_id + "  " + first_colligate + "  " + second_colligate + "  " + colligate + "  " + manager);
//
//        System.out.println("---------------------------------------updateEvaluate----- 3  ----------------------------");
//        return humanService.findEvaluate(user_id);
//    }

    //更新面试评价表 一面 人力面试 first_colligate
    @RequestMapping(value = "z", produces = "application/json;charset=utf-8")
    public @ResponseBody EvaluateDto updateFirst(EvaluateDto evaluateDto) {
        System.out.println("---------------------------------------updateEvaluate--- 1  ------------------------------");
        humanService.UpdateEvaluate(evaluateDto);
        String user_id = evaluateDto.getUser_id();
        String first_colligate = evaluateDto.getFirst_colligate();
        if (first_colligate.equals("通过")) {
            interviewService.updateFirstRecruStatus(user_id);
            humanService.updateFirstYes(user_id);
        } else
            humanService.updateFirstNo(user_id);
        System.out.println("---------------------------------------updateEvaluate----- 2  ----------------------------");
        System.out.println(user_id + "  " + first_colligate);

        System.out.println("---------------------------------------updateEvaluate----- 3  ----------------------------");
        return humanService.findEvaluate(user_id);
    }

    //更新面试评价表 二面 部门经理面试 second_colligate
    @RequestMapping(value = "/updateSecond", produces = "application/json;charset=utf-8")
    public @ResponseBody EvaluateDto updateSecond(EvaluateDto evaluateDto) {
        System.out.println("---------------------------------------updateEvaluate--- 1  ------------------------------");
        humanService.UpdateEvaluate(evaluateDto);
        String user_id = evaluateDto.getUser_id();
        String second_colligate = evaluateDto.getSecond_colligate();
        if (second_colligate.equals("通过")) {
            interviewService.updateSecondRecruStatus(user_id);
            humanService.updateSecondYes(user_id);
        } else
            humanService.updateSecondNo(user_id);
        System.out.println("---------------------------------------updateEvaluate----- 2  ----------------------------");
        System.out.println(user_id + "  " + second_colligate);

        System.out.println("---------------------------------------updateEvaluate----- 3  ----------------------------");
        return humanService.findEvaluate(user_id);
    }

    //更新面试评价表 一审 部门主管审批 colligate
    @RequestMapping(value = "/updateColligate", produces = "application/json;charset=utf-8")
    public @ResponseBody EvaluateDto updateColligate(EvaluateDto evaluateDto) {
        System.out.println("---------------------------------------updateEvaluate--- 1  ------------------------------");
        humanService.UpdateEvaluate(evaluateDto);
        String user_id = evaluateDto.getUser_id();
        String colligate = evaluateDto.getColligate();
        if (colligate.equals("通过")) {
            interviewService.updateFirst1RecruStatus(user_id);
        } else {
            humanService.updateManagerNo(user_id);
        }

        System.out.println("---------------------------------------updateEvaluate----- 2  ----------------------------");
        System.out.println(user_id + "  " + colligate);

        System.out.println("---------------------------------------updateEvaluate----- 3  ----------------------------");
        return humanService.findEvaluate(user_id);
    }

    //更新面试评价表 二审 人力审批 manager
    @RequestMapping(value = "/updateManager", produces = "application/json;charset=utf-8")
    public @ResponseBody EvaluateDto updateManager(EvaluateDto evaluateDto) {
        System.out.println("---------------------------------------updateEvaluate--- 1  ------------------------------");
        humanService.UpdateEvaluate(evaluateDto);
        String user_id = evaluateDto.getUser_id();
        String manager = evaluateDto.getManager();
        if (manager.equals("通过")) {
            interviewService.updateSecond1RecruStatus(user_id);
            humanService.updateEmployYes(user_id);
        } else
            humanService.updateManagerNo(user_id);

        System.out.println("---------------------------------------updateEvaluate----- 2  ----------------------------");
        System.out.println(user_id + "  " + manager);

        System.out.println("---------------------------------------updateEvaluate----- 3  ----------------------------");
        return humanService.findEvaluate(user_id);
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
        System.out.println("---------------------------findAnswer-----------------------------");
        System.out.println(post);
        if (post.equals("商务助理")){
            System.out.println("----------------- 1 -------------------");
            Assistent_answer assistent_answer = new Assistent_answer();
            AssistentWriteDto assistentWriteDto = new AssistentWriteDto();
            Assistent_subject assistent_subject = new Assistent_subject();
            assistent_subject = interviewService.findAssSubject();
            assistent_answer = interviewService.findAssistentWrite(user);
            System.out.println(assistent_answer.toString());
            assistentWriteDto.setAssistent_answer(assistent_answer);
            assistentWriteDto.setAssistent_subject(assistent_subject);
            return assistentWriteDto;
        }if (post.equals("区域销售")){
            System.out.println("----------------- 2 -------------------");
            Sale_subject sale_subject = new Sale_subject();
            Sale_answer sale_answer = new Sale_answer();
            SaleWriteDto saleWriteDto = new SaleWriteDto();
            sale_answer = interviewService.findSaleWrite(user);
            sale_subject = interviewService.findSaleSubject();
            saleWriteDto.setSale_subject(sale_subject);
            saleWriteDto.setSale_answer(sale_answer);
            return saleWriteDto;
        }else{
            System.out.println("----------------- 3 -------------------");
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
    public @ResponseBody Map selectResult(User user){
        return interviewService.selectResult(user);
    }
}
