package by.bsu.lab1.creator;

public class ArrayCreator {

    public  int[] factoryArray(String[] values){
        int[] result = new int[values.length];
        for (int i = 0; i < values.length ; i++) {
            result[i] = Integer.parseInt(values[i]);
        }
        return  result;
    }
}
