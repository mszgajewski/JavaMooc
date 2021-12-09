package OnlineShop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> listofProducts;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.listofProducts = new HashMap<>();
    }

    public void addProduct(String name, int price, int stock){
        prices.put(name,price);
        listofProducts.put(name, stock);
    }

    public int price(String name){
        return prices.getOrDefault(name, -99);
    }

    public int stock(String name){
        return listofProducts.getOrDefault(name,0);
    }

    public boolean take(String product){
        if(this.stock(product) > 0) {
            listofProducts.put(product, listofProducts.get(product) - 1);
        }

        return false;
    }

    public Set<String> products(){
        Set<String> productNameSet = new HashSet<>();
        for(String key : prices.keySet()){
            productNameSet.add(key);
        }
        return productNameSet;
    }


}