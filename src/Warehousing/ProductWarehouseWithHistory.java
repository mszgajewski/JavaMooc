package Warehousing;

public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory changeHistory = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);

        super.addToWarehouse(initialBalance);
        changeHistory.add(initialBalance);
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(getBalance());
    }

    @Override
    public double takeFromWareHouse(double amount) {
        double taken = super.takeFromWareHouse(amount);
        this.changeHistory.add(getBalance());
        return taken;
    }

    public String history(){
        return this.changeHistory.toString();
    }

    public void printAnalysis(){

        System.out.println("Product: " + this.getName());

        System.out.println("History: " + changeHistory.toString());

        System.out.println("Largest amount of product: " + changeHistory.maxValue());

        System.out.println("Smallest amount of product:" + changeHistory.minValue());

        System.out.println("Average: " + changeHistory.average());


    }
}
