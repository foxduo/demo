package com.duoduo.controller;

import com.duoduo.service.UserLoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



/**
 * Created by FOX_duo on 2017/9/20.
 */
@Controller
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    private Logger log = LoggerFactory.getLogger(UserLoginController.class);

    @RequestMapping(value = "/user/login")
    public String userLogin(@RequestParam String username,@RequestParam String password){

        if (log.isDebugEnabled()) {
            log.debug("Enter UserLoginController.userLogin ");
        }

        int count = userLoginService.userLogin(username, password);


        return "login";
    }
}

