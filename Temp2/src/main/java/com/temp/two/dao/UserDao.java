package com.temp.two.dao;


import com.temp.two.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ps on 2017/10/17.
 */
@Mapper
@Component
public interface UserDao {

    List<User> searchAll();
}
