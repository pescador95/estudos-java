package com.pescador95.cursos.nelioalves.secao13.ex1.application;

import com.pescador95.cursos.nelioalves.secao13.ex1.entities.Account;
import com.pescador95.cursos.nelioalves.secao13.ex1.entities.BusinessAccount;
import com.pescador95.cursos.nelioalves.secao13.ex1.entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account acc1, acc2, acc3;

        acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withDraw(200.0);
        System.out.println(acc1.getBalance());

        acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withDraw(200.0);
        System.out.println(acc2.getBalance());

        acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withDraw(200.0);
        System.out.println(acc3.getBalance());

    }
}
