package com.duoduo.service.impl;

import com.duoduo.dao.UserDao;
import com.duoduo.mapper.UserLoginMapper;
import com.duoduo.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by FOX_duo on 2017/9/20.
 */

//@Service("userLoginService")
@Component
public class UserLoginServiceImpl implements UserLoginService{

    @Autowired
    private UserDao userDao;


    @Override
    public int userLogin(String msisdn, String password)
    {
        System.out.println("msisdn = "+msisdn +"passwor = "+password);


        int count=userDao.getUserLognCount(msisdn,password);

        return count;
    }
}
