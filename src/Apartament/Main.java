package Apartament;


public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        Apartment warszawa = new Apartment(1, 36, 5500);
        Apartment krakow = new Apartment(2, 38, 4200);
        Apartment lodz = new Apartment(3, 78, 2500);

        if (lodz.moreExpensiveThan(warszawa)){
            System.out.println("Mieszkanie w łodzi: " + lodz + " jest droższe od mieszania w warszawie: " + warszawa);
            System.out.println(lodz);

        } else {
            System.out.println("Mieszkanie w warszawie: " + warszawa + "  jest droższe od mieszania w łodzi: " + lodz);

        }

        System.out.println("Różnica w cenie mieszkań wynosi: " + lodz.priceDifference(warszawa) + "zł netto");
    }
}
