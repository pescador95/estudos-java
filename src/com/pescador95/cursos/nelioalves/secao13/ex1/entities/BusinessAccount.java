package com.pescador95.cursos.nelioalves.secao13.ex1.entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if (amount <= loanLimit) {
            deposit(amount);
        }
    }

    @Override
    public void withDraw(Double amount) {
        super.withDraw(amount);
        balance -= 2.0;
    }
}
