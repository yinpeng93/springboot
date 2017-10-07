package com.yp.springboot.controller;

import com.yp.springboot.bean.Account;
import com.yp.springboot.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    IAccountService accountService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Account> getAccounts() {
        return accountService.findAccountList();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Account getAccountById(@PathVariable("id") int id) {
        return accountService.findAccountById(id);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateAccount(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
                                @RequestParam(value = "money", required = true) double money) {
        Account account = new Account();
        account.setId(id);
        account.setMoney(money);
        account.setName(name);
        int t = accountService.update(account);
        if (t == 1) {
            return account.toString();
        } else {
            return "fail";
        }
    }

    /**
     * 借用postman工具
     *
     * @param name
     * @param money
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addAccount(@RequestParam(value = "name", required = true) String name,
                             @RequestParam(value = "money", required = true) double money) {
        Account account = new Account();
        account.setName(name);
        account.setMoney(money);
        int t = accountService.add(account);
        if (t == 1) {
            return account.toString();
        } else {
            return "fail";
        }
    }


}
