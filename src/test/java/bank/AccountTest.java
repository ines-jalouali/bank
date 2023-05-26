package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

	
    @SuppressWarnings("deprecation")
    private static Stream<Account> accountProvider() {
        return Stream.of(
                new Account("1", 1000, 0.05),
                new Account("2", 2000, 0.06),
                new Account("3", 3000, 0.07)
        );
    }

    @ParameterizedTest
    @MethodSource("accountProvider")
    public void testDeposit(Account account) {
        double amount = 100;
        double expectedBalance = account.getBalance() + amount;
        account.deposit(amount);
        assertEquals(expectedBalance, account.getBalance(), 0);
    }

    @ParameterizedTest
    @MethodSource("accountProvider")
    public void testWithdraw(Account account) {
        double amount = 100;
        double expectedBalance = account.getBalance() - amount;
        account.withdraw(amount);
        assertEquals(expectedBalance, account.getBalance(), 0);
    }

//    @ParameterizedTest
//    @MethodSource("accountProvider")
//    public void testTransfer(Account fromAccount, Account toAccount) {
//        double amount = 100;
//        double expectedFromBalance = fromAccount.getBalance() - amount;
//        double expectedToBalance = toAccount.getBalance() + amount;
//        fromAccount.transfer(toAccount, amount);
//        assertEquals(expectedFromBalance, fromAccount.getBalance(), 0);
//        assertEquals(expectedToBalance, toAccount.getBalance(), 0);
//    }
} 


