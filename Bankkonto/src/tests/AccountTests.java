package tests;


import bank.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTests {
    private bank.Account account;

        @BeforeEach
        public void setUp() { // This method is run before each test to set the initial state of the account
            long initialCash = 1500;
            long accountNr = 123456789;
            this.account = new bank.Account(initialCash, accountNr);
        }

        @Test
        public void testNonNegativeAccount(){ // This test checks that the account works with a non-negative initial cash and account number
            // Arrange (from setup)

            // Act
            long actualBalance = account.getBalance();
            long actualAccountNr = account.getAccountNr();

            // Assert
            assertEquals(1500, account.getBalance());
            assertEquals(123456789, account.getAccountNr());
        }

        @Test
        public void testNegativeInitialCashAccount(){ // This test checks that the initial cash cannot be negative when creating an account
            // Arrange
            long initialCash = -1500;
            long accountNr = account.getAccountNr();

            // Act & Assert
            assertThrows(IllegalArgumentException.class, () -> new Account(initialCash, accountNr));
        }

        @Test
        public void testNegativeAccountNrAccount(){ // This test checks that the account number cannot be negative when creating an account
            // Arrange
            long accountNr = -123456789;
            long initialCash = account.getBalance();

            // Act & Assert
            assertThrows(IllegalArgumentException.class, () -> new Account(initialCash, accountNr));
        }

        @Test
        void testInitialBalance() { //  This test checks that the initial balance is correct
            // Arrange
            this.account.initialCash = 1000;
            long expectedInitialCash = account.initialCash;

            // Act
            long actualInitialCash = account.getBalance();

            // Assert
            assertEquals(expectedInitialCash, actualInitialCash);
        }

        @Test
        void testInitialAccountNumber() { // This test checks that the initial account number is correct
            // Arrange
            long expectedAccountNumber = 123456789;


            // Act
            long actualAccountNumber = account.getAccountNr();

            // Assert
            assertEquals(expectedAccountNumber, actualAccountNumber);
        }

        @Test
        void testPositiveDepositAmount() { // This test checks that the deposit method works as expected
            // Arrange
            long depositAmount = 500;
            long expectedBalance = account.getBalance() + depositAmount;

            // Act
            account.deposit(depositAmount);
            long actualBalance = account.getBalance();

            // Assert
            assertEquals(expectedBalance, actualBalance);
        }

        @Test
        void testNegativeDepositAmount() { // This test checks that the deposit method throws an exception when the amount is negative because it should not be possible to deposit a negative amount
            // Arrange
            long negativeAmount = -500;

            // Act & Assert
            assertThrows(IllegalArgumentException.class, () -> account.deposit(negativeAmount));
        }

        @Test
        void testWithdrawSufficientBalance() { // This test checks that the withdraw method works as expected which means that the balance is updated correctly when the amount is less than the balance else it throws an exception
            // Arrange
            long withdrawAmount = 500;
            long expectedBalance = account.getBalance() - withdrawAmount;

            // Act
            account.withdraw(withdrawAmount);
            long actualBalance = account.getBalance();

            // Assert
            assertEquals(expectedBalance, actualBalance);
        }

        @Test
        void testWithdrawInsufficientBalance() { // This test checks that the withdraw method throws an exception when the amount is greater than the balance because it should not be possible to withdraw more than the balance
            // Arrange
            long withdrawAmount = -1500;

            // Act & Assert
            assertThrows(IllegalArgumentException.class, () -> account.withdraw(withdrawAmount));
        }
    }


