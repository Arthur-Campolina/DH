package model.entities;

import model.exceptions.CurrentAccountException;

public class CurrentAccount extends Account {

    private final static double fee = 1.50;

    public CurrentAccount(Integer number, String holder, Double balance, double withdrawalLimit) {
        super(number, holder, balance, withdrawalLimit);
    }


    public double getFee() {
        return fee;
    }

    @Override
    public void deposit(Double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdrawal(Double amount) {
        validateWithdrawl(amount);
        super.withdrawal(fee);
        super.withdrawal(amount);
    }

    @Override
    public void validateWithdrawl(double amount) {
        if (amount > getWithdrawalLimit()) {
            throw new CurrentAccountException("Erro de saque: A quantia excede o limite de saque");
        }
        if (amount > getBalance()) {
            throw new CurrentAccountException("Erro de saque: Saldo insuficiente");
        }
    }
}