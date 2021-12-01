package SimpleDictionary;

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String word = scanner.nextLine();

            if (word.equals("end")) {
                break;
            } else if(word.equals("add")){
                add();
            } else if(word.equals("search")){
                search();
            } else {
                System.out.println("Uknown");
            }

        }

        System.out.println("Bye bye!");
    }
    public void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        this.dictionary.add(word, translation);
    }

    public void search() {
        System.out.print("To be translated: ");
        String wordToTranslate = scanner.nextLine();
        if (this.dictionary.translate(wordToTranslate) != null) {
            System.out.print("Translation: ");
            System.out.println(this.dictionary.translate(wordToTranslate));
        } else {
            System.out.println("Word " + wordToTranslate + " was not found");
        }
    }


}
