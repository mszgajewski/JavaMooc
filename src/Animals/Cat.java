package Animals;


public class Cat extends Animal implements NoiseCapable {

    public Cat(String name) {
        super(name);
    }
    public Cat(){
        super("Kot");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    public void purr(){

        System.out.println( super.getName()+ " mruczy");
    }

    @Override
    public void makeNoise() {
        purr();
    }
}
