package Herds;

import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> herdList;

    public Herd() {
        this.herdList = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herdList.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : this.herdList) {
            Movable.super.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Movable movable : this.herdList) {
            result += movable + "\n";
        }
        return result;
    }
}
