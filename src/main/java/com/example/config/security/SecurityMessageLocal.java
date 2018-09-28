package com.example.config.security;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Locale;

/**
 * @Auther: caic
 * @Date: 2018/9/28 09:17
 * @Description: 异常信息本地化
 * @Version: 1.0
 */
@Configuration
public class SecurityMessageLocal {
    @Bean
    public MessageSource messageSource() {
        Locale.setDefault(Locale.CHINESE);
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.addBasenames("classpath:org/springframework/security/messages_zh_CN");
        //messageSource.addBasenames("classpath:security/messages_zh_CN");
        return messageSource;
    }

}
