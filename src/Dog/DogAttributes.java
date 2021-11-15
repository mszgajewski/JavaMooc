package Dog;

import java.util.Scanner;

public class DogAttributes {
    public static void main(String[] args) {

        Dog Boo = new Dog("Boo", "terier", 12);

        System.out.println(Boo);

    }
}

class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name,String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.breed+ ", "  + this.age;
    }
}