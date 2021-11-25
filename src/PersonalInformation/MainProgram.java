package PersonalInformation;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First name: ");
            String userName = scanner.nextLine();
            if (userName.isEmpty()) {
                break;
            }

            System.out.print("Last name: ");
            String userLastName = scanner.nextLine();

            System.out.print("Identification number: ");
            int idNumber = Integer.valueOf(scanner.nextLine());

            persons.add(new Person(userName, userLastName, idNumber));
            }
 
            for (Person person : persons) {
                System.out.println(person);
            }
        }
    }
