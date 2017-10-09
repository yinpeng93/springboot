package com.yp.springboot.controller;

import com.yp.springboot.entity.Account;
import com.yp.springboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping("/list")
    public List<Account> findAccountList() {
        return accountService.findAccountList();
    }

    @RequestMapping("/{id}")
    public Account findAccountById(@PathVariable("id") int id) {
        return accountService.findAccountById(id);
    }

    @RequestMapping("/update/{id}")
    public String updateAccount(@RequestParam("name") String name, @RequestParam("money") double money,
                                @PathVariable("id") int id) {
        int t = accountService.update(name, money, id);
        if (t == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping("/add")
    public String addAccount(@RequestParam("name") String name, @RequestParam("money") double money) {
        int t = accountService.add(name, money);
        if (t == 1) {
            return "success";
        } else {
            return "fail";
        }
    }
}
