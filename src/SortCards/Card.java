package SortCards;

public class Card implements Comparable<Card>{

    private int value;
    private Suit suit;

    public Card(int value, Suit suit){
        if(value < 2 || value > 14){
            throw new IllegalArgumentException("KArta musi mieć wartość pomiędzy 2 a 14");
        }
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if (value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }
        return suit + " " + cardValue;

    }

    @Override
    public int compareTo(Card card) {
        if(this.getValue() == card.getValue()){
            return this.getSuit().ordinal() - card.getSuit().ordinal();
        }

        return this.getValue() - card.getValue();
    }
}