package com.temp.three.service;

import java.util.List;
import java.util.Map;

import com.temp.three.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StuMybatisService {
    @Autowired
    private StudentMapper studentMapper;
    public List<Map<String,Object>> find(){
        return studentMapper.find();
    }
    public int insert(int id){
        return studentMapper.insert(id);
    }
}
