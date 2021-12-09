package OnlineShop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> itemMap;

    public ShoppingCart() {
        this.itemMap = new HashMap<>();
    }

    public void add(String product, int price){
        if (itemMap.keySet().contains(product)){
            increaseQuantity(product);
        } else {
            itemMap.put(product,new Item(product,1,price));
        }
    }

    public int price(){
        int totalPrice = 0;
        for (Item element : itemMap.values()){
            totalPrice += element.price();
        }
        return totalPrice;
    }

    public void increaseQuantity(String product){
        this.itemMap.get(product).increaseQuantity();
    }

    public void print(){
        for(String element : itemMap.keySet()){
            System.out.println(itemMap.get(element).toString());
        }
    }
}

