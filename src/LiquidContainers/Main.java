package LiquidContainers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cointainer first = new Cointainer();
        Cointainer second = new Cointainer();

        while (true){
            System.out.println("First: "+ first);
            System.out.println("Second: "+ second);
            String input = scanner.nextLine();
            String[] inputParts = input.split(" ");

            if(inputParts[0].equals("quit")){
                break;
            } else {
                String command = inputParts[0];
                int amount = Integer.valueOf(inputParts[1]);
                if (command.equals("add")) {
                    if (first.contains() + amount <= 100 && amount >= 0) {
                        first.add(amount);
                    } else {
                        first.setLiquidAmount(100);
                    }
                } else if(command.equals("move")) {
                    if (first.contains() - amount >= 0 && amount >= 0) {
                        if (second.contains() + amount <= 100) {
                            if (amount <= first.contains()) {
                                first.remove(amount);
                                second.add(amount);
                            } else {
                                first.setLiquidAmount(0);
                                second.add(amount);
                            }
                        } else {
                            first.remove(amount);
                            second.setLiquidAmount(100);
                        }
                    } else {
                        second.add(first.contains());
                        first.setLiquidAmount(0);
                    }
                } else if( command.equals("remove")){
                        if (second.contains() - amount >= 0 && second.contains() - amount <= 100) {
                            second.remove(amount);
                        } else {
                            second.setLiquidAmount(0);
                        }
                }
            }
        }
    }
}
