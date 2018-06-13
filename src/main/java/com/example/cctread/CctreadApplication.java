package com.example.cctread;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages = "com.example")
@MapperScan("com.example.cctread.dao")
public class CctreadApplication {
	public static void main(String[] args) {
		SpringApplication.run(CctreadApplication.class, args);
	}
}
