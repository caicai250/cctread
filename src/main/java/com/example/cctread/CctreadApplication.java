package com.example.cctread;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication(scanBasePackages = "com.example")
@EnableTransactionManagement
@MapperScan("com.example.cctread.dao")
public class CctreadApplication {
	public static void main(String[] args) {
		SpringApplication.run(CctreadApplication.class, args);
	}
}
