package Warehousing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory(){
        this.history = new ArrayList<>();

    }

    public void add(double status){
        this.history.add(status);
    }

    public void clear(){
        this.history.clear();
    }

    public double maxValue(){
        if(history.isEmpty()){
            return 0.0;
        }
        return Collections.max(history);
    }

    public double minValue(){
        if(history.isEmpty()){
            return 0.0;
        }
        return Collections.min(history);
    }

    public double average(){
        double sum = 0.0;

        if(history.isEmpty()){
            return 0.0;
        }

        for(double element : history){
            sum += element;
        }
        return sum / history.size();
    }


    @Override
    public String toString() {
        return "history= " + history.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChangeHistory that = (ChangeHistory) o;
        return Objects.equals(history, that.history);
    }

    @Override
    public int hashCode() {
        return Objects.hash(history);
    }
}
