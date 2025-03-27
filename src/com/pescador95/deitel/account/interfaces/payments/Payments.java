package com.pescador95.deitel.account.interfaces.payments;

import com.pescador95.deitel.account.entity.Account;

public interface Payments {

    void deposit(Double depositAmount);


    Double getBalance();

    Account createAccount(String theName, Double theBalance);

    static void printAccount(Account account){
        if (account != null) {
            System.out.println("------------Account-----------------------\n");
            System.out.printf("UUID: %s%n", account.getUUID());
            System.out.printf("Account owner: %s%n", account.getName());
            System.out.printf("Balance: %.2f%n", account.getBalance());
            System.out.println("------------------------------------------");
            System.out.println();
        }
    }
}
