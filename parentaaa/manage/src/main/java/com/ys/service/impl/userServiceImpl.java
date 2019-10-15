package com.ys.service.impl;

import com.ys.commons.JsonUtils;
import com.ys.mapper.selById;
import com.ys.pojo.User;
import com.ys.service.userService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class userServiceImpl implements userService {
    @Resource
    private selById sel;
    @Override
    public String showUser() {
        List<User> user = sel.selAll();
        System.out.println(user);
        return JsonUtils.objectToJson(user);
    }
}
