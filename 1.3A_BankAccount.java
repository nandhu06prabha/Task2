public class Account {
    private double balance;
    public Account() {
        this.balance = 0;
    }
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Method to withdrawal amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawal successfully.");
        } else {
            System.out.println("Invalid balance.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
