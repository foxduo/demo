package com.duoduo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by FOX_duo on 2017/9/18.
 */
@Controller
public class UserController {


    //读取配置文件下的内容
    @Autowired
    private Environment environment;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String name () {

        String url=environment.getProperty("spring.datasource.driverClaseName");
        System.out.println("url = " + url);

        return "index";
    }


}
