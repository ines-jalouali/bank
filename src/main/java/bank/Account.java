package bank;

public class Account {

    private String id;
    private double balance;
    private double interestRate;

    public Account(String id, double balance, double interestRate) {
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        }
    }

    public void transfer(Account account, double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.withdraw(amount);
            account.deposit(amount);
        }
    }

    public double calculateInterest() {
        return this.balance * this.interestRate;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
