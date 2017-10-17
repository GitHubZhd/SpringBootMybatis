package com.temp.three.controller;

import java.util.List;
import java.util.Map;

import com.temp.three.service.StuMybatisService;
import org.apache.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stumybatis")
public class StuMybatisController {
    private static Logger logger = LoggerFactory.getLogger(StuMybatisController.class);
    @Autowired
    private StuMybatisService stuMybatisService;

    @RequestMapping("/list")
    public List<Map<String,Object>> getStus(){
        logger.info("从数据库读取Student集合");
        return stuMybatisService.find();
    }
    @RequestMapping("/add")
    public void addStus(){
        logger.info("student表中插入数据");
        int id= (int) (System.currentTimeMillis()/1000);
        stuMybatisService.insert(id);
    }
}
