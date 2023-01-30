package com.example.demo.repository;

import com.example.demo.entity.Account;
import com.example.demo.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {

    public Account getByEmail(String email);
}
