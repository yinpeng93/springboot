package com.yp.myproject.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * PropertySource不能加载yml配置文件，只可以加载properties，
 * 一般把数据放在application.yml中,springboot启动时就加载
 */
@Configuration
@PropertySource("classpath:test.properties")
@ConfigurationProperties(prefix = "com.yp")
public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
