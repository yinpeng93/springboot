package com.yp.springboot.service;

import com.yp.springboot.dao.AccountMapper;
import com.yp.springboot.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountMapper accountMapper;

    public int add(String name, double money) {
        return accountMapper.add(name, money);
    }

    public int update(String name, double money, int id) {
        return accountMapper.update(name, money, id);
    }

    public int delete(int id) {
        return accountMapper.delete(id);
    }

    public Account findAccountById(int id) {
        return accountMapper.findAccountById(id);
    }

    public List<Account> findAccountList() {
        return accountMapper.findAccountList();
    }
}
