public class CurrentAccount extends Account implements Tax {

    private final double allowedValue = getBalance();

    public CurrentAccount() {
    }

    public CurrentAccount(Double balance) {
        super(balance);
    }

    public double getAllowedValue() {
        return allowedValue;
    }

    @Override
    public void withdrawal(Double value) {
        try {
            if (value != 0.00 && value <= allowedValue) {
                setBalance(getBalance() - value);
            }
        } catch (Exception e) {
            throw new IllegalStateException("Valór Inválido");
        }
    }

    @Override
    public void tax(Double percentage) {
        setBalance(getBalance() - (getBalance()*(percentage/100)));
    }
}
