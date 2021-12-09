package OnlineShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Warehouse warehouse = new Warehouse();


        Store store = new Store(warehouse,scanner);

        warehouse.addProduct("woda", 2, 10);
        warehouse.addProduct("chrupki", 3, 15);
        store.shop("Żaneta");


    }
}
