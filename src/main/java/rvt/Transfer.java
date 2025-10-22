package rvt;
public class Transfer {

    public static class Account {
        private double balance;

        public Account(double initialBalance) {
            this.balance = initialBalance;
        }

        public boolean withdraw(double amount) {
            balance -= amount;
            return true;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public double getBalance() {
            return balance;
        }
    }
    public static void main(String[] args) {
        Account Matthews_account = new Account(1000.0);
        Account My_account = new Account(0.0);
        double transferAmount = 100.0;

        Matthews_account.withdraw(transferAmount);
        My_account.deposit(transferAmount);

        System.out.println("Matthews account balance:  " + Matthews_account.getBalance());
        System.out.println("My account balance: " + My_account.getBalance());
    }
}