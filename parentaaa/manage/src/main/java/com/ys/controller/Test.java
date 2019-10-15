package com.ys.controller;


import com.ys.pojo.User;
import com.ys.service.userService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class Test {
    @Resource
    private userService userServiceImpl;

    @RequestMapping("aaa")
    @ResponseBody
    public String aaa(){
        return userServiceImpl.showUser();
    }

}

