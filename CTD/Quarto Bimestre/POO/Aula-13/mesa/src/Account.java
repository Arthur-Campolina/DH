public abstract class Account {

    private Double balance;
    
    public Account() {
    }
    
    public Account(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double value) {
       this.balance += value;
    }

    public abstract void withdrawal(Double value);
}
