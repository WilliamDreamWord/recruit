package com.cs.recruit.service.impl;

import com.cs.recruit.dao.ManagerDao;
import com.cs.recruit.dto.*;
import com.cs.recruit.entity.User;
import com.cs.recruit.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by asus on 2018/8/10.
 */
@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerDao managerDao;
    @Override
    //查看所有已通过面试者
    public List<listDto> findInterview2(String dept_id) {
        return managerDao.findInterview2(dept_id);
    }

    //查看个人简历详情
    @Override
    public DetailsDto findDetails(User user) {
        return managerDao.findDetails(user.getUser_id());
    }

    //查看笔试结果详情
    @Override
    public String findPost(User user) {
        return managerDao.findPost(user.getUser_id());
    }

    @Override
    public AssistentWriteDto findWriteAssistent(User user) {
        return managerDao.findWriteAssistent(user.getUser_id());
    }

    @Override
    public OtherWriteDto findWriteOther(User user) {
        return managerDao.findWriteOther(user.getUser_id());
    }

    @Override
    public SaleWriteDto findWriteSale(User user) {
        return managerDao.findWriteSale(user.getUser_id());
    }
    //查看面试评价
    @Override
    public EvaluateDto findEvaluate(User user) {
        return managerDao.findEvaluate(user.getUser_id());
    }
    //查看性格测试
    @Override
    public CharacterDto findCharacter(User user) {
        return managerDao.findCharacter(user.getUser_id());
    }
    //决定是否录用
    @Override
    public int UpdateEvaluate(EvaluateDto evaluateDto) {
        return managerDao.UpdateEvaluate(evaluateDto);
    }

    @Override
    public int updateUserNo(String user_id) {
        return managerDao.updateUserNo(user_id);
    }

    @Override
    public int updateUserYes(String user_id) {
        return managerDao.updateUserYes(user_id);
    }


}
