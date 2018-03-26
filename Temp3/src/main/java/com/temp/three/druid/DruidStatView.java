package com.temp.three.druid;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/druid/*", description = "接口验证")
public class DruidStatView extends StatViewServlet {

    @Override
    protected String process(String url) {
        return super.process(url);
    }
}

