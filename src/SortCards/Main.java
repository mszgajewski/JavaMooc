package SortCards;

public class Main {
    public static void main(String[] args) {

        Hand hand = new Hand();
        hand.add( new Card(12,Suit.HEART) );
        hand.add( new Card(14,Suit.DIAMOND) );
        hand.add( new Card(2,Suit.SPADE) );
        hand.add( new Card(2,Suit.CLUB) );

        Hand hand2 = new Hand();
        hand2.add( new Card(13,Suit.CLUB) );
        hand2.add( new Card(11,Suit.SPADE) );
        hand2.add( new Card(4,Suit.HEART) );
        hand2.add( new Card(6,Suit.DIAMOND) );

        hand.getSumOfValues();
        hand.sortBySuit();
        hand.compareTo(hand2);

    }
}
