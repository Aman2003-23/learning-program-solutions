package com.cognizant.account;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Account getAccountDetails(@PathVariable String number) {
        // Return dummy account details
        return new Account(number, "savings", 234343);
    }

    // Simple POJO to hold account data
    static class Account {
        private String number;
        private String type;
        private int balance;

        // Constructor
        public Account(String number, String type, int balance) {
            this.number = number;
            this.type = type;
            this.balance = balance;
        }

        // Getters
        public String getNumber() { return number; }
        public String getType() { return type; }
        public int getBalance() { return balance; }
    }
}
