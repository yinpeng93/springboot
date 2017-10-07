package com.yp.myproject.controller;

import com.yp.myproject.bean.ConfigBean;
import com.yp.myproject.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class, User.class})
public class ConfigBeanController {
    @Autowired
    ConfigBean configBean;
    @Autowired
    User user;

    @RequestMapping("/configInfo")
    public String info() {
        return configBean.getGreeting() + ">>>" + configBean.getUuid() + ">>>" +
                configBean.getValue() + ">>>" + configBean.getMax() + ">>>" +
                configBean.getNumber();
    }

    @RequestMapping("/user")
    public String user() {
        return user.getName() + ">>>" + user.getAge();
    }
}
