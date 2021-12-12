package SortCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;

    public Hand(){
        this.cards = new ArrayList<>();
    }

    public void add(Card card){
        this.cards.add(card);
    }

    public void print(){
        this.cards.stream().forEach(card -> {
            System.out.println(card);
        });
    }

    public int getSumOfValues(){
        return cards.stream().mapToInt(card -> card.getValue()).sum();
    }

    public void sort(){
        Collections.sort(this.cards);
    }

    @Override
    public int compareTo(Hand hand) {
        int thisValue = this.cards.stream()           //these get the sums
                .map( card -> card.getValue())
                .reduce(0, (a, b) -> a + b);
        int otherValue = hand.cards.stream()
                .map( card -> card.getValue())
                .reduce(0, (a, b) -> a + b);

        return thisValue - otherValue;
    }

    public void sortBySuit(){
        Collections.sort(this.cards, new BySuitInValueOrder());
    }

}
