package RecipeSearch;

import java.util.Scanner;

public class UserInterface {
    private  Scanner scanner;
    private  RecipeBook recipeBook;

    public UserInterface(Scanner scanner, RecipeBook recipeBook){
        this.scanner = scanner;
        this.recipeBook = recipeBook;
    }

    public void start(){

        System.out.println("""
                Polecenia:
                lista - lista przepisów
                nazwa - szukanie przepisu przez nazwę
                czas - szukanie przepisu poprzez czas przygotowania
                składnik - szukanie poprzez składnik w przepisie
                stop - zatrzumanie programu""");

        label:
        while (true){
            System.out.println("Wpisz polecenie");

            String command = scanner.nextLine();

            switch (command) {
                case "stop":
                    break label;
                case "lista":
                    System.out.println("Przepisy:");
                    recipeBook.printRecipeBook();
                    break;
                case "nazwa": {
                    System.out.println("Szukane słowo");
                    String name = scanner.nextLine();
                    System.out.println("Przepisy:");
                    recipeBook.printRecipeByName(name);
                    break;
                }
                case "czas":
                    System.out.println("Podaj czas przygotowania:");
                    int czas = Integer.parseInt(scanner.nextLine());
                    System.out.println("Przepisy:");
                    recipeBook.printRecipeByTime(czas);
                    break;
                case "składnik": {
                    System.out.println("Szukany składnik");
                    String name = scanner.nextLine();
                    System.out.println("Przepisy:");
                    recipeBook.printRecipeByingredient(name);
                    break;
                }
                default:
                    System.out.println("Nieznane polecenie");
                    break;
            }
        }
    }
}
