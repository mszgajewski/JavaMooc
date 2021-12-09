package Weighting;

import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public int totalWeight(){
        return suitcases.stream()
                .mapToInt(suitcase -> suitcase.totalWeight())
                .sum();
    }

    public void addSuitcase(Suitcase suitcase){
        if(this.totalWeight() + suitcase.totalWeight() < maxWeight){
            this.suitcases.add(suitcase);
        }
    }

    public void printItems(){
        suitcases.stream()
                .forEach(suitcase -> suitcase.printItems());
    }

    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }

        if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }

        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}

