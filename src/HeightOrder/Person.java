package HeightOrder;

import java.util.Objects;

public class Person {
    private String name;
    private int height;

    public Person(String name, int height){
        this.name = name;
        this.height = height;

    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.height + " cm)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return height == person.height && name.equals(person.name);
    }
}
