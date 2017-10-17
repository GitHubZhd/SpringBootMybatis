package com.study.mybatis.dao;

import com.study.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by ps on 2017/10/17.
 */
@Mapper
public interface UserDao {

    List<User> searchAll();
}
