package com.yp.myproject.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 该类用来测试读取配置文件
 *
 * @author yp
 * @since 2017-10-6
 */
@RestController
public class ConfigController {

    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;

    @RequestMapping("/info")
    public String getInfo() {
        return name + ":" + age;
    }
}
