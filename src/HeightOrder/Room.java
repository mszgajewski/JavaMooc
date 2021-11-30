package HeightOrder;

import SantaPackage.Gift;

import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room(){
        this.persons = new ArrayList<>();
    }

    public void add(Person person){
        this.persons.add(person);
    }

    public boolean isEmpty(){
      return this.persons.isEmpty();

    }

    public ArrayList<Person> getPersons(){
        return this.persons;
    }

    public Person shortest(){
        Person shortest = new Person("max", Integer.MAX_VALUE);
        for(Person element : persons){
            if(shortest.getHeight() > element.getHeight()){
                shortest = element;
            }
        }
        return shortest;
    }

    public Person take(){
        if (persons.isEmpty()) {
            return null;
        }
        int shortestIndex = 0;
        for (int i = 0; i < persons.size(); i++) {
            if (shortest().equals(persons.get(i))) {
                shortestIndex = i;
            }
        }

        return persons.remove(shortestIndex);

    }
}

