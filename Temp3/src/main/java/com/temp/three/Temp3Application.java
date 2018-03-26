package com.temp.three;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ServletComponentScan //添加的注解
@SpringBootApplication
public class Temp3Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Temp3Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Temp3Application.class);
	}
}

/**
 * test druid
 * 监控页面: http://localhost:8060/druid/index.html
 */
