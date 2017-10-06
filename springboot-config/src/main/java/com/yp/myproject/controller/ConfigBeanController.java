package com.yp.myproject.controller;

import com.yp.myproject.bean.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class ConfigBeanController {
    @Autowired
    ConfigBean configBean;

    @RequestMapping("/configInfo")
    public String info() {
        return configBean.getGreeting() + ">>>" + configBean.getUuid() + ">>>" +
                configBean.getValue() + ">>>" + configBean.getMax() + ">>>" +
                configBean.getNumber();
    }
}
