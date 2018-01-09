package com.example.cctutil;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;


@Configuration
@PropertySource ("classpath:application.properties")//注意路径
public class DateSourceTest {

    @Value("spring.datasource")
    private DataSource dateSource;

    public DataSource getDateSource() {
        return dateSource;
    }

    public void setDateSource(DataSource dateSource) {
        this.dateSource = dateSource;
    }
}
