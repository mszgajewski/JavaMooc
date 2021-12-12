package MagicSquare;

import java.util.ArrayList;

public class MagicSquare {
    private int[][] square;

    public MagicSquare(int size){
        if(size < 2){
            size = 2;
        }
        this.square = new int[size][size];
    }

    public ArrayList<Integer> sumOfRows(){
        ArrayList<Integer> rows = new ArrayList<>();
        int sumOfRows = 0;
        for(int row = 0; row < square.length; row++){
            for(int column = 0; column < square[row].length; column++){
                sumOfRows += square[row][column];
            }
            rows.add(sumOfRows);
            sumOfRows = 0;
        }
        return rows;

    }
}
