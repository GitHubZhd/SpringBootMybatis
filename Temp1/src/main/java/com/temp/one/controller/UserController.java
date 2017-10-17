package com.temp.one.controller;


import com.temp.one.dao.UserMapper;
import com.temp.one.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ps on 2017/10/17.
 */
@RestController
@RequestMapping("/home")
public class UserController {

    @Autowired
    UserMapper userMapper;

    //方式一---------------------------------------------
    @RequestMapping(value = "/user")
    public String user(){
        User user = userMapper.findUserByAge(19);
        return user.getName()+"-----"+user.getAge();
    }

    @RequestMapping("/user/add")
    public void add(){
        User user=new User();
        user.setName("cwl");
        user.setAge(25);
        user.setSex('F');

        userMapper.add(user);
    }
}
