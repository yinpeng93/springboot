package com.yp.springboot.service;

import com.yp.springboot.bean.Account;

import java.util.List;

public interface IAccountService {
    int add(Account account);

    int delete(int id);

    int update(Account account);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
