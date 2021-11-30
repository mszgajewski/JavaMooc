package SantaPackage;

import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gifts;

    public Package() {
        gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    public int totalWeight() {
        int weight = 0;
        for (Gift element : gifts) {
            weight += element.getWeight();
        }
        return weight;
    }
}

