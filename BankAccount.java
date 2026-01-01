package javaprograms;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    
    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient balance! Withdrawal denied.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Current Balance: " + balance);
    }
}