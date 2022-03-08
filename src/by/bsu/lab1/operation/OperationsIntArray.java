package by.bsu.lab1.operation;

public class OperationsIntArray {

    public static int findMax(int[] array){
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
