package RecipeSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> PancakeDoughIngredients = new ArrayList<>(Arrays.asList("mleko", "jajko", "mąka", "sól", "masło"));
        Recipe pancakeDough = new Recipe("Naleśniki", 40, PancakeDoughIngredients);

        ArrayList<String> meatballsIngredients = new ArrayList<>(Arrays.asList("mięso mielone", "jajko", "sól", "bółka tarta"));
        Recipe meatballs = new Recipe("Pulpety mięsne", 20, meatballsIngredients);

        ArrayList<String> TofuRoolsIngredients = new ArrayList<>(Arrays.asList("mleko", "jajko", "mąka", "sól", "masło"));
        Recipe tofuRools = new Recipe("Zawijane Tofu", 30, TofuRoolsIngredients);

        Scanner scanner = new Scanner(System.in);
        RecipeBook recipeBook = new RecipeBook();

        recipeBook.add(pancakeDough);
        recipeBook.add(meatballs);
        recipeBook.add(tofuRools);

        UserInterface userInterface = new UserInterface(scanner,recipeBook);

        userInterface.start();
    }
}
