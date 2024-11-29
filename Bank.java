import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    // Create a new account
    public void createAccount(String accountNumber, String accountHolderName, double initialDeposit) {
        Account newAccount = new Account(accountNumber, accountHolderName, initialDeposit);
        accounts.add(newAccount);
        System.out.println("Account created successfully!");
    }

    // Find account by account number
    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    // Transfer money between accounts
    public void transfer(String fromAccount, String toAccount, double amount) {
        Account sender = findAccount(fromAccount);
        Account receiver = findAccount(toAccount);

        if (sender != null && receiver != null) {
            if (sender.getBalance() >= amount) {
                sender.withdraw(amount);
                receiver.deposit(amount);
                System.out.println("Transfer successful!");
            } else {
                System.out.println("Insufficient balance in sender's account.");
            }
        } else {
            System.out.println("One or both account numbers are invalid.");
        }
    }

    // Display account details
    public void displayAccount(String accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder: " + account.getAccountHolderName());
            System.out.println("Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}
