package com.duoduo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by FOX_duo on 2017/10/13.
 */

@Mapper
@Component(value="userLoginMapper")
public interface UserLoginMapper {


    public int getUserLognCount (String msisdn,String password);

}
