class BankAccount {
    private double balance;
    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Invalid withdrawal");
    }
    public double getBalance() {
        return balance;
    }
}
public class Exp2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        acc.withdraw(500);
        acc.withdraw(2000);
        System.out.println("Balance: " + acc.getBalance());
    }
}