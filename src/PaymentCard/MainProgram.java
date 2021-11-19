package PaymentCard;

public class MainProgram {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(5000);
        System.out.println(card);

        card.eatAffordably();
        System.out.println(card);

        card.eatHeartily();
        card.eatAffordably();
        System.out.println(card);

        card.addMoney(15);
        System.out.println(card);

        card.addMoney(-10);
        System.out.println(card);
    }
}