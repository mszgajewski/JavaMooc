package Debt;

public class MainProgram {
    public static void main(String[] args) {

        Debt mbank = new Debt(120000.0, 1.01);
        mbank.printBalance();

        mbank.waitOneYear();
        mbank.printBalance();

        int years = 0;

        while (years < 20) {
            mbank.waitOneYear();
            years = years + 1;
        }

        mbank.printBalance();
    }
}
