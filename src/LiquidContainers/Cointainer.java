package LiquidContainers;

public class Cointainer {

    private int liquid;

    public Cointainer(){
        this.liquid = 0;

    }

    public int contains(){
        return this.liquid;
    }

    public void add(int amount) {
        if (this.liquid + amount <= 100 && amount >= 0) {
            liquid += amount;
        } else {
            liquid = 100;
        }
    }

    public void remove(int amount){
        if(this.liquid - amount >= 0 && liquid - amount <= 100){
            this.liquid -= amount;
        } else {
            liquid = 0;
        }
    }

    @Override
    public String toString() {
        return  liquid + "/100";
    }

    public void setLiquidAmount(int liquidAmount) {
        this.liquid = liquidAmount;
    }

}
