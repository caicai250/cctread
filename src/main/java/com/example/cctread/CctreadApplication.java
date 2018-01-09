package com.example.cctread;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.example")
public class CctreadApplication {

	public static void main(String[] args) {
		SpringApplication.run(CctreadApplication.class, args);

	}
}
