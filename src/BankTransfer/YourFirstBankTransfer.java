package BankTransfer;

    public class YourFirstBankTransfer {

        public static void main(String[] args) {
            // Do not touch the code in Account.java
            // write your program here

            Account mattAccount = new Account("Matthews account", 1000.00);

            Account myAccount = new Account("My account", 0);

            mattAccount.withdrawal(100);

            myAccount.deposit(100);

            System.out.print(mattAccount + " \n " + myAccount);


        }
    }
    class Account {

    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdrawal(double amount) {
        this.balance = this.balance - amount;
    }

    public double balance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return this.owner + " balance: " + this.balance;
    }
}
