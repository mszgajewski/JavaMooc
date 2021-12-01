package Sorting;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println(indexOfSmallest(numbers));
    }

    public static int smallest(int[] array) {

        int est = Integer.MAX_VALUE;
        for (int element : array) {
            if (element <= est) {
                est = element;
            }
        }
        return est;
    }
    public static int indexOfSmallest(int[] array){
        int smallest = 0;
        int min = smallest(array);

        for( int i = 0; i < array.length; i++){
            if(array[i] == min){
                smallest = i;
            }
        }
        return smallest;

    }
}

