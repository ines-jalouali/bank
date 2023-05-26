package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void removeAccount(Account account) {
        this.accounts.remove(account);
    }

    public void displayBalances() {
        for (Account account : this.accounts) {
            System.out.println("Account " + account.getId() + ": " + account.getBalance());
        }
    }

    public void transfer(Account fromAccount, Account toAccount, double amount) {
        fromAccount.transfer(toAccount, amount);
    }
}
