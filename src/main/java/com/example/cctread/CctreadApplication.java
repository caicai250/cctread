package com.example.cctread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages = "com.example")
public class CctreadApplication {
	public static void main(String[] args) {
		SpringApplication.run(CctreadApplication.class, args);
	}
}
