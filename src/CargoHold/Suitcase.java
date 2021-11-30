package CargoHold;

import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        if(item.getWeight() + totalWeight() <= maxWeight){
            this.items.add(item);
        }

    }

    public void printItems(){
        for (Item element : items){
            System.out.println(element);
        }
    }

    public int totalWeight(){
        int totalWeight = 0;
        for(Item element: this.items){
            totalWeight += element.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }

        Item itemObject = this.items.get(0);

        for(Item item : this.items) {
            if (itemObject.getWeight() < item.getWeight()){
                itemObject = item;
            }
        }
        return itemObject;
    }

    @Override
    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        } else {
            return this.items.size() + " items (" + totalWeight() + " kg)";
        }

    }
}
