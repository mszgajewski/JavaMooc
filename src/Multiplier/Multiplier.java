package Multiplier;

public class Multiplier {

    private int number;

    public Multiplier(int number) {
        this.number = number;
    }

    public int getNumber(int number){
        int result = this.number * number;
        return result;
    }
}
