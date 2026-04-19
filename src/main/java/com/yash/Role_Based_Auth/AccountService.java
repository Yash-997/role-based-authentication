package com.yash.Role_Based_Auth;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @PreAuthorize("hasRole('USER')")
    public String getBalance(){
        return "The Balance is 80000";
    }

    @PreAuthorize("hasRole('ADMIN')")
    public String closeAcount(){
        return "Account Closed";
    }
}
