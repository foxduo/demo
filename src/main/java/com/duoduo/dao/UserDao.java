package com.duoduo.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Objects;

/**
 * Created by FOX_duo on 2017/10/13.
 */
@Repository
public class UserDao {

    /*@Autowired
    RedisUtil redisUtil;*/

    public  int getUserLognCount(String msisdn, String password){
        /*Object object=redisUtil.get("test1");
        if(Objects.isNull(object))
        {
            redisUtil.set("test1",33333);
            return 1;
        }*/
        return Integer.valueOf(5);
    }
}
