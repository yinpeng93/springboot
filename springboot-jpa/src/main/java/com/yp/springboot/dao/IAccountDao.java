package com.yp.springboot.dao;

import com.yp.springboot.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountDao extends JpaRepository<Account, Integer> {
}
