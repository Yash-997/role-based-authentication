package com.yash.Role_Based_Auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    AccountService accountService;

    @GetMapping("/Bal")
    public String getBalance(){
        return accountService.getBalance();
    }

    @GetMapping("/close")
    public String closeAccount(){
        return accountService.closeAcount();
    }
    @GetMapping("/about")
    public String about(){
        return "This  is Bank ";
    }
}
