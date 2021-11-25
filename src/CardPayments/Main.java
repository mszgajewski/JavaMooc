package CardPayments;

public class Main {
    public static void main(String[] args) {
        PaymentTerminal cafe = new PaymentTerminal();
        System.out.println(cafe);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = cafe.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        cafe.addMoneyToCard(annesCard, 100);

        wasSuccessful = cafe.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(cafe);
    }
}
