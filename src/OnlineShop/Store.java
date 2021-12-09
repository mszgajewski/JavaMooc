package OnlineShop;

import java.util.Scanner;

public class Store {

    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    // the method that handles the customers visit to the store.
    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Witamy w sklepie " + customer);
        System.out.println("nasz asortyment:");

        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("Co chcesz dodać do koszyka (wciśnij enter by zakończyć): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            }

            if(this.warehouse.products().contains(product)){
                this.warehouse.take(product);
                int price = this.warehouse.price(product);
                cart.add(product,price);
            }
        }

        System.out.println("Twoje produkty w koszyku:");
        cart.print();
        System.out.println("łącznie: " + cart.price() + "zł");
    }
}
