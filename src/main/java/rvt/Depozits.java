package rvt;
public class Depozits {

    public static class Account {
        private double balance;

        public Account(double initialBalance) {
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public double getBalance() {
            return balance;
        }
    }
    public static void main(String[] args) {
        Account account = new Account(100.0);
        account.deposit(20.0);
        System.out.println(account.getBalance());
    }
}
