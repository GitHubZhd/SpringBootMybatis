package com.study.mybatis.dao;

import com.study.mybatis.model.User;
import org.apache.ibatis.annotations.*;

/**
 * Created by ps on 2017/10/17.
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where age = #{age}")
    User findUserByAge(@Param("age")int age);

    @Insert("insert into user(name,age,sex) values (#{name},#{age},#{sex})")
    void add(User user);

    @Update("update user set age=#{age} where name=#{name}")
    void update(User user);

    @Delete("delete from user where name=#{name}")
    void delete(String name);
}
