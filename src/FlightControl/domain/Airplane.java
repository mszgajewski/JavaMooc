package FlightControl.domain;

public class Airplane {

    private String id;
    private int capacity;

    public Airplane(String id, int capacity){
        this.capacity = capacity;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return  id + " (" + capacity +
                " osób pojemności)";
    }
}
