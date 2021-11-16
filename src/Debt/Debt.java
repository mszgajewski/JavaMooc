package Debt;

public class Debt {

    private double balance;
    private double oprocentowanie;

    public Debt(double bieerzacyBalance, double obecneOprocentowanie) {
        this.balance = bieerzacyBalance;
        this.oprocentowanie = obecneOprocentowanie;
    }

    public void printBalance(){
        System.out.println(this.balance);

    }
    public void waitOneYear(){

        this.balance = this.balance * this.oprocentowanie;

    }

}
