package com.bank.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
    @Autowired
    private AccountsRepository accountsRepository;

    @PostMapping("/myAccount")
    public Accounts getAccountDetail(@RequestBody Customer customer){
        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId());

        if (accounts != null)
            return accounts;
        else
            return null;
    }
}
