package com.example.cctread;

import com.example.config.CctreadConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import javax.sql.DataSource;


@SpringBootApplication(scanBasePackages = "com.example")
@EnableConfigurationProperties ({CctreadConfig.class})
public class CctreadApplication {
	public static void main(String[] args) {
		SpringApplication.run(CctreadApplication.class, args);

	}
}
