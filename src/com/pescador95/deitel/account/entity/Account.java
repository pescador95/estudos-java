package com.pescador95.deitel.account.entity;

import com.pescador95.deitel.account.dto.InputDTO;
import com.pescador95.deitel.account.interfaces.io.IO;
import com.pescador95.deitel.account.interfaces.payments.Payments;

import java.util.Scanner;
import java.util.UUID;

public class Account implements Payments, IO {

    private UUID uuiid;
    private String name;
    private Double balance;

    public Account(){
        this.setUUID();
        balance = 0.0;
    }

    public Account(String name, Double balance){
        this.setUUID();
        this.setName(name);
        this.balance = 0.0;
        if(balance > 0.0){
            this.deposit(balance);
        }
    }

    public UUID getUUID(){
        return uuiid;
    }

    public void setUUID(){
        this.uuiid = UUID.randomUUID();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    @Override
    public void deposit(Double depositAmount){
        if(depositAmount != null && depositAmount > 0.0){
            balance += depositAmount;
            System.out.printf("Depositing %.2f into %s's account...\n\n", depositAmount, name);
        }
    }
    @Override
    public Double getBalance(){
        return balance;
    }

    @Override
    public Account createAccount(String theName, Double theBalance) {

        if (theName == null || theName.isEmpty() || theName.isBlank()) {

            System.out.println("Name can't be null");
        return null;
        }
        return new Account(theName, theBalance);
    }

    @Override
    public InputDTO insert(String theName, Double theBalance) {
        return new InputDTO(theName, theBalance);
    }

    @Override
    public InputDTO insert() {

        String theName;

        double theBalance;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name: ");

        theName = input.nextLine();

        System.out.print("Enter the balance: ");

        theBalance = input.nextDouble();

        return new InputDTO(theName, theBalance);
    }
}
