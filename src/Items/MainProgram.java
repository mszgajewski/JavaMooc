package Items;


import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            items.add(new Item(scanner.nextLine()));

            if (scanner.nextLine().isEmpty()) {
                for(Item a: items) {
                    System.out.println(a);
                }
                break;
            }
        }
    }
}
