package com.temp.one.dao;

import com.temp.one.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * Created by ps on 2017/10/17.
 * @author zhd
 */
@Mapper
@Component
public interface UserMapper {
    @Select("select * from user where age = #{age}")
    User findUserByAge(@Param("age") int age);

    @Insert("insert into user(name,age,sex) values (#{name},#{age},#{sex})")
    void add(User user);

    @Update("update user set age=#{age} where name=#{name}")
    void update(User user);

    /**
     * @param name
     */
    @Delete("delete from user where name=#{name}")
    void delete(String name);
}
