package com.temp.two.controller;

import com.temp.two.dao.UserDao;
import com.temp.two.model.User;
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
    UserDao userDao;

    //方式二-------------------------------------------------
    @RequestMapping("/user/search")
    public Object search(){

        List<User> users=userDao.searchAll();
        System.out.println(users.size());

        return users;
    }
}
