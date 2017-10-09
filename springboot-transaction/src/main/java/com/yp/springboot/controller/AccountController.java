package com.yp.springboot.controller;

import com.yp.springboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping("/transfer")
    public String transfer() {
        try {
            accountService.transfer();
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
        return "success";
    }
}
