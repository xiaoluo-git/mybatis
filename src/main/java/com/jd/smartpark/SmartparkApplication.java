package com.jd.smartpark;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.jd.smartpark.accessdoor.mapper")
public class SmartparkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartparkApplication.class, args);
	}

}
