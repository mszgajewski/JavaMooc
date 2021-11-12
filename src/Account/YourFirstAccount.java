package Account;

public class YourFirstAccount {

    public static void main(String[] args) {

        Account szymonAccount = new Account("Szymon", 10000.0);

        szymonAccount.withdrawal(50.0);

        szymonAccount.deposit(200.0);

        System.out.println(szymonAccount.saldo());

        System.out.println(szymonAccount.toString() +"zł");

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

    public double saldo() {
        return this.balance;
    }

    @Override
    public String toString() {
        return this.owner + " balance: " + this.balance;
    }
}