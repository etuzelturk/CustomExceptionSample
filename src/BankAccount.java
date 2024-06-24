public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws NegativeBalanceException {
        if (amount > balance) {
            throw new NegativeBalanceException("There is not enough money for withdrawal.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
