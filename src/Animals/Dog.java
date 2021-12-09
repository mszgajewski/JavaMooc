package Animals;

public class Dog extends Animal implements NoiseCapable {

    public Dog(String name) {
        super(name);
    }
    public Dog(){
        super("Pies");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    public void bark(){

        System.out.println( super.getName()+ " szczeka");
    }

    @Override
    public void makeNoise() {
        bark();
    }
}
