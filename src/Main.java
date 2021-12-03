import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


            // Do the operations required here!

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
            HashMap<String, String> nickNames = new HashMap<>();

            nickNames.put("mathhew", "matt");
            nickNames.put("micheael", "mix");
            nickNames.put("arthur", "artie");

            System.out.println(nickNames.get(name));

    }
}
