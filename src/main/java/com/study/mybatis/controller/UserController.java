package com.study.mybatis.controller;

import com.study.mybatis.dao.UserDao;
import com.study.mybatis.dao.UserMapper;
import com.study.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ps on 2017/10/17.
 */
@RestController
@RequestMapping("/home")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserDao userDao;

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

    //方式二-------------------------------------------------
    @RequestMapping("/user/search")
    public void search(){

        List<User> users=userDao.searchAll();
        System.out.println(users.size());
    }
}
