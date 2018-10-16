package com.cs.recruit.web;

import com.cs.recruit.entity.*;
import com.cs.recruit.service.HumanService;
import com.cs.recruit.service.InterviewService;
import com.cs.recruit.service.ManagerService;
import com.cs.recruit.util.WordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import freemarker.template.Configuration;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by asus on 2018/8/22.
 */
@Controller
@RequestMapping(value = "/file")
@EnableSwagger2
public class FileController {
    @Autowired
    private InterviewService interviewService;
    @Autowired
    private ManagerService managerService;
    @Autowired
    private HumanService humanService;
    @RequestMapping(value = "/filedDownload")
    public @ResponseBody void fileDownload(HttpServletResponse response){
        User user = new User();
        user.setUser_id("7f317809-c6fd-41da-be55-a59863553a65");
        Calendar calendar = Calendar.getInstance();//获取当前日期
        if (user != null){
            System.out.println("-------------------------fileDownload---------------------");
            Apply apply = interviewService.selectApply(user);
            System.out.println(apply.toString());
            Base base = interviewService.selectBase(user);
            System.out.println(base.toString() + "-----------------base-----------------");
            List<Teach> teachList = interviewService.selectTeach(user);
            System.out.println(teachList.toString() + "--------------teach-------------------");
            List<Work> workList = interviewService.selectWork(user);
            System.out.println(workList.toString() + "------------------work---------------");
            List<Family> familyList = interviewService.selectFamily(user);
            System.out.println(familyList.toString() + "-------------------family-------------------");

            Map<String ,Object> map = new HashMap<String ,Object>();
            map.put("post",apply.getPost()!=null?apply.getPost():"无");
            map.put("money",apply.getMoney()!=null?apply.getMoney():"无");
            map.put("formdate",apply.getFormdate()!=null?apply.getFormdate():"无");
            map.put("comedate",apply.getComedate()!=null?apply.getComedate():"无");
            map.put("rale_name",base.getRale_name()!=null?base.getRale_name():"无");
            map.put("sex",base.getSex()!=null?base.getSex():"无");
            map.put("birthday",base.getBirthday()!=null?base.getBirthday():"无");
            map.put("haw",base.getHaw()!=null?base.getHaw():"无");
            map.put("nation",base.getNation()!=null?base.getNation():"无");
            map.put("phone",base.getPhone()!=null?base.getPhone():"无");
            map.put("email",base.getEmail()!=null?base.getEmail():"无");
            map.put("language",base.getLanguage()!=null?base.getLanguage():"无");
            map.put("job",base.getJob()!=null?base.getJob():"无");
            map.put("idcard",base.getIdcard()!=null?base.getIdcard():"");
            map.put("certificate",base.getCertificate()!=null?base.getCertificate():"无");
            map.put("address",base.getAddress()!=null?base.getAddress():"无");
            map.put("friend",base.getFriend()!=null?base.getFriend():"无");
            map.put("hobby",base.getHobby()!=null?base.getHobby():"无");
            map.put("contact_name",base.getContact_name()!=null?base.getContact_name():"无");
            map.put("contact_phone",base.getContact_phone()!=null?base.getContact_phone():"无");
            for (int i = 0; i < teachList.size(); i++){
                map.put("begandend1"+(i+1),teachList.get(i).getBegandend()!=null?teachList.get(i).getBegandend():"无");
                map.put("schoole1"+(i+1),teachList.get(i).getBegandend()!=null?teachList.get(i).getBegandend():"无");
                map.put("major1"+(i+1),teachList.get(i).getMajor()!=null?teachList.get(i).getMajor():"无");
                map.put("record1"+(i+1),teachList.get(i).getRecord()!=null?teachList.get(i).getRecord():"无");
            }
            for (int i = 0; i < workList.size(); i++){
                map.put("begandend2"+(i+1),workList.get(i).getBegandend()!=null?workList.get(i).getBegandend():"无");
                map.put("comname2"+(i+1),workList.get(i).getComname()!=null?workList.get(i).getComname():"无");
                map.put("peoplenum2"+(i+1),workList.get(i).getPeoplenum()!=null?workList.get(i).getPeoplenum():"无");
                map.put("post2"+(i+1),workList.get(i).getPost()!=null?workList.get(i).getPost():"无");
                map.put("money2"+(i+1),workList.get(i).getMoney()!=null?workList.get(i).getMoney():"无");
                map.put("why2"+(i+1),workList.get(i).getWhy()!=null?workList.get(i).getWhy():"无");
                map.put("witness2"+(i+1),workList.get(i).getWitness()!=null?workList.get(i).getWitness():"无");
            }
            for (int i = 0; i < familyList.size(); i++){
                map.put("status",familyList.get(0).getStatus()!=null?familyList.get(0).getStatus():"无");
                map.put("relay3"+(i+1),familyList.get(i).getRelay()!=null?familyList.get(i).getRelay():"无");
                map.put("name3"+(i+1),familyList.get(i).getName()!=null?familyList.get(i).getName():"无");
                map.put("address3"+(i+1),familyList.get(i).getName()!=null?familyList.get(i).getName():"无");
                map.put("post3"+(i+1),familyList.get(i).getPost()!=null?familyList.get(i).getPost():"无");
                map.put("phone3"+(i+1),familyList.get(i).getPhone()!=null?familyList.get(i).getPhone():"无");
            }
            try {
                WordUtils.exportMillCertificateWord(response,map,"简历","template.ftl");
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
