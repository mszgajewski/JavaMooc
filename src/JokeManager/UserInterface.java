package JokeManager;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager jokeManager;

    public UserInterface(Scanner scanner, JokeManager jokeManager){
        this.scanner = scanner;
        this.jokeManager = jokeManager;
    }

    public void start() {
        while (true) {
            printMenu();
            String word = scanner.nextLine();

            if (word.equals("x")) {
                break;
            } else if (word.equals("1")) {
                add();
            } else if (word.equals("2")) {
                drawJoke();
            } else if (word.equals("3")) {
                printJoke();
            }
        }
    }

    public void add() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        this.jokeManager.addJoke(joke);
    }

    public void drawJoke() {
        System.out.println(this.jokeManager.drawJoke());
    }

    public void printJoke(){
        jokeManager.printJokes();
    }

    public void printMenu() {
        System.out.println("Commands:");
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");
        System.out.println("X - stop");
    }

}

