package IsInThatFile;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainProgram {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Nazwa pliku:");
            String file = scanner.nextLine();

            System.out.println("Szukane słowo:");
            String searchedFor = scanner.nextLine();

            boolean isFound = false;

            try (Scanner fileScanner = new Scanner(Paths.get(file))){

                while(fileScanner.hasNextLine()){
                    String word = fileScanner.nextLine();

                    if(searchedFor.equals(word)){
                        isFound = true;
                    }
                }

                if (isFound) {
                    System.out.println("Znalezioono!");
                } else {
                    System.out.println("Nie znaleziono.");
                }

            } catch (Exception e) {
                System.out.println("Odczytywanie pliku" + file + "zakończone niepowodzeniem");
            }

        }
}
