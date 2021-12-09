package DifferentKindsOfBoxes;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    private ArrayList<Item> itemsInBox;
    private int capcity;

    public BoxWithMaxWeight(int capcity){
        this.capcity = capcity;
        this.itemsInBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {

    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }

    public int currentAmount(){
        int sum = 0;

        for(Item element : itemsInBox){
            sum += element.getWeight();
        }
        return sum;
    }
}
