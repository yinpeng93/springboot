package com.yp.springboot.service;

import com.yp.springboot.dao.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;

    @Transactional
    public void transfer() throws RuntimeException {
        accountMapper.update(20, 1);
        int i = 1 / 0;
        accountMapper.update(990, 2);
    }
}
