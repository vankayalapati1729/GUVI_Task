public class Account {
    private double balance;

    // No-argument constructor: initializes balance to 0
    public Account() {
        this.balance = 0.0;
    }

    // Two-argument constructor: initializes balance with a specified amount
    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0.0;
        }
    }

    // Method to deposit an amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Main method to test the Account class
    public static void main(String[] args) {
        // Creating account using no-argument constructor
        Account account1 = new Account();
        account1.displayBalance();

        // Depositing and withdrawing from account1
        account1.deposit(500);
        account1.withdraw(200);
        account1.displayBalance();

        // Creating account using two-argument constructor
        Account account2 = new Account(1000);
        account2.displayBalance();

        // Depositing and withdrawing from account2
        account2.deposit(300);
        account2.withdraw(1500);
        account2.displayBalance();
    }
}

/*
Output

Current balance: 0.0
Successfully deposited: 500.0
Successfully withdrew: 200.0
Current balance: 300.0
Current balance: 1000.0
Successfully deposited: 300.0
Insufficient balance. Withdrawal failed.
Current balance: 1300.0

 */