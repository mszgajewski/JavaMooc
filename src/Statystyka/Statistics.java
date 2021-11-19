package Statystyka;

public class Statistics {
    private int count;
    private int sum;

    public Statistics(){
        this.count = count;
        this.sum = sum;

    }

    public void addNumber(int number) {
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return count;
    }

    public int sum(){
        return sum;
    }

    public double average(){
        double result = 0;

        if(sum!= 0 && count!=0){
             result=1.0 * sum/count;
        }

        return result;
    }
}
