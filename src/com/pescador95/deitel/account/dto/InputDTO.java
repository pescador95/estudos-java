package com.pescador95.deitel.account.dto;

public class InputDTO {

    private String name;
    private Double balance;

    public InputDTO(String name, Double balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public Double getBalance(){
        return balance;
    }
}
