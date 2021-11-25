package CardPayments;

public class PaymentTerminal {

    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentTerminal(){
        this.money = 1000.00;
    }

    public double eatAffordably(double payment) {
        double change = payment;

        if(payment >= 2.50){
            affordableMeals++;

            this.money += 2.50;

            change = change - 2.50;
        }

        return change;
    }

    public double eatHeartily(double payment){
        double change = payment;

        if(payment >= 4.60){
            heartyMeals++;

            this.money += 4.60;

            change = change - 4.60;
        }

        return change;
    }

    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum>0){
            card.addMoney(sum);
            this.money += sum;
        }
    }

    public boolean eatAffordably(PaymentCard card) {

        if(card.balance() >= 2.50){
            affordableMeals++;
            return card.takeMoney(2.50);
        }

        return false;
    }

    public boolean eatHeartily(PaymentCard card) {

        if(card.balance() >= 4.60){
            heartyMeals++;
            return card.takeMoney(4.60);
        }

        return false;
    }

    @Override
    public String toString(){
        return "money: " + money + ", number of affordable meals: " + affordableMeals + ", number of hearty meals: " + heartyMeals;
    }

}
