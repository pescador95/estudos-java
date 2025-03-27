package com.pescador95.cursos.nelioalves.secao13.ex1.application;

import com.pescador95.cursos.nelioalves.secao13.ex1.entities.Account;
import com.pescador95.cursos.nelioalves.secao13.ex1.entities.BusinessAccount;
import com.pescador95.cursos.nelioalves.secao13.ex1.entities.SavingsAccount;

public class Examples {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);

        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        /* Upcasting */
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        /* Downcasting */

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        if(acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

    }

}