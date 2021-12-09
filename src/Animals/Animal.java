package Animals;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(this.name + " je");
    }

    public void sleep(){
        System.out.println(this.name + " śpi");
    }

    public String getName() {
        return name;
    }
}
