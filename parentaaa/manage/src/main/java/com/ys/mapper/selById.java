package com.ys.mapper;

import com.ys.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface selById {
    @Select("select * from usersd")
    List<User> selAll();

}
