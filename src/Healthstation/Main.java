package Healthstation;

public class Main {

    public static void main(String[] args) {


        HealthStation childrensHospital = new HealthStation();

        Person zaneta = new Person("Żaneta", 28, 162, 48);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(zaneta);
        childrensHospital.weigh(zaneta);
        childrensHospital.weigh(zaneta);
        childrensHospital.weigh(zaneta);

        zaneta.printPerson();
        System.out.println(zaneta.bmi());
        zaneta.growOlder();
        zaneta.printPerson();

        System.out.println("weighings performed: " + childrensHospital.weighings());

    }

    }
