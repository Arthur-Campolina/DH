package model.entities;

import model.impl.AccountImpl;

public abstract class Account implements AccountImpl {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawalLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawalLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawalLimit = withdrawalLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(Double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    // Metodo para depositar na conta.
    @Override
    public void deposit(Double amount) {
        this.balance += amount;
    }

    // Metodo para sacar da conta.
    @Override
    public void withdrawal(Double amount) {
        balance -= amount;
    }

    // Metodo para validar o saque da conta.
    public abstract void validateWithdrawl(double amount);
}
