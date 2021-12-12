package SortCards;

import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        if(card1.getSuit().ordinal() == card2.getSuit().ordinal()) {
            return card1.compareTo(card2);
        }
        return card1.getSuit().ordinal() - card2.getSuit().ordinal();
    }

}
