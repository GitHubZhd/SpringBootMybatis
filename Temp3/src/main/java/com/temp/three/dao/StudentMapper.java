package com.temp.three.dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface StudentMapper {

    @Select("select * from student;")
    List<Map<String,Object>> find();

    @Insert("insert into student(id,name,age,score_sum,score_avg) "+
            "values(#{id},'Jim',33,200,100)")
    int insert(@Param("id") int id);
}
