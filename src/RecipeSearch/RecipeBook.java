package RecipeSearch;

import java.util.ArrayList;

public class RecipeBook {
    private final ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void printRecipeByName(String name) {
        if (this.recipes.isEmpty()) {
            System.out.println("Brak przepisów");
        } else {
            for (Recipe element : recipes) {
                if (element.getName().toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(element);
                }
            }
        }
    }

    public void printRecipeByTime(int time) {
        if (this.recipes.isEmpty()) {
            System.out.println("Brak przepisów");
        } else {
            for (Recipe element : recipes) {
                if (element.getTime() <= time) {
                    System.out.println(element);
                }
            }
        }
    }
    public void printRecipeByingredient(String ingredient){
        if (this.recipes.isEmpty()) {
            System.out.println("Brak przepisów");
        } else {
            for (Recipe element : recipes) {
                if (element.getIngredients().contains(ingredient.toLowerCase())) {
                    System.out.println(element);
                }
            }
        }
    }
    public void printRecipeBook(){
        for (Recipe element : recipes){
            System.out.println(element);
        }
    }
}
