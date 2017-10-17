package com.temp.three;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//加上这个注解，使得支持事务
@EnableTransactionManagement
@SpringBootApplication
public class Temp3Application {

	public static void main(String[] args) {
		SpringApplication.run(Temp3Application.class, args);
	}
}
