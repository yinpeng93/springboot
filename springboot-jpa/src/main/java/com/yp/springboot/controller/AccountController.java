package com.yp.springboot.controller;

import com.yp.springboot.dao.IAccountDao;
import com.yp.springboot.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    IAccountDao accountDao;

    @RequestMapping("/list")
    public List<Account> getAccounts() {
        return accountDao.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Account getAccountById(@PathVariable("id") int id) {
        return accountDao.findOne(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateAccount(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
                                @RequestParam(value = "money", required = true) double money) {
        Account account = new Account();
        account.setId(id);
        account.setMoney(money);
        account.setName(name);
        Account account1 = accountDao.saveAndFlush(account);
        return account1.toString();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addAccount(@RequestParam(value = "name", required = true) String name,
                             @RequestParam(value = "money", required = true) double money) {
        Account account = new Account();
        account.setName(name);
        account.setMoney(money);
        Account account1 = accountDao.save(account);
        return account1.toString();
    }
}
