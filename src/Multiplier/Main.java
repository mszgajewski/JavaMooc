package Multiplier;

public class Main {

    public static void main(String[] args) {

         Multiplier multiplyByThree = new Multiplier(3);

         System.out.println("multiplyByThree.multiply(2): " + multiplyByThree.getNumber(2));

         Multiplier multiplyByFour = new Multiplier(4);

         System.out.println("multiplyByFour.multiply(2): " + multiplyByFour.getNumber(2));
         System.out.println("multiplyByThree.multiply(1): " + multiplyByThree.getNumber(1));
         System.out.println("multiplyByFour.multiply(1): " + multiplyByFour.getNumber(1));
    }
}