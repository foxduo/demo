package com.duoduo.dao;



import com.duoduo.bean.User;
import com.duoduo.mapper.UserLoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Created by FOX_duo on 2017/10/13.
 */
@Component
public class UserDao {

    @Autowired
    UserLoginMapper mapper;

    public  int getUserLognCount(String msisdn, String password){

      //int count= mapper.getUserLognCount("13893580482","");
      System.out.println("UserDao.getUserLognCount");

        List<User> list=mapper.listByUsername("13758256823");
        System.out.println(list.toString());

        return Integer.valueOf(5);
    }
}
