package PersonalInformation;

public class Person {

    private String name;
    private String lastName;
    private int idNumber;



    public Person(String name, String lastName, int idNumber) {
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }
    @Override
    public String toString(){
        return this.name + " " + this.lastName + " (" + this.idNumber + ")";
    }

}