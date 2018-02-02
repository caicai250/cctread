package com.example.cctutil.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * bean工具类
 *
 * @author caiteng
 * @version 1.0 创建时间：2018-01-16 15:12
 */
@Component
public class BeanUtil implements ApplicationContextAware {


    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (BeanUtil.applicationContext == null) {
            BeanUtil.applicationContext = applicationContext;
        }
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * 通过name获取bean
     *
     * @param name beanName
     * @return
     */
    public static Object getBean(String name) {
        return getApplicationContext().getBean(name);
    }

    /**
     * 通过calss获取bean
     *
     * @param clazz
     * @return
     */
    public static <T> T getBean(Class<T> clazz) {
        return getApplicationContext().getBean(clazz);
    }


}
