package by.bsu.lab1.run;
import by.bsu.lab1.creator.ArrayCreator;
import by.bsu.lab1.filter.StringFilter;
import by.bsu.lab1.operation.OperationsIntArray;
import by.bsu.lab1.reader.InfoReader;
import java.util.Arrays;

/*Ввести с консоли n целых чисел. На консоль вывести:
  2. Наибольшее и наименьшее число.*/

public class Main {

    public static void main(String[] args) {
        String[] strings;

        if (args.length == 0){
            System.out.println("Array of arguments from command line is empty. \nPlease, enter array of integer numbers as line: ");
            InfoReader reader = new InfoReader();
            strings = reader.readStringArray(System.in);
        }
        else {
            System.out.println("Array of integer numbers from arguments of command line: ");
            strings = args;
        }

        StringFilter filter = new StringFilter();
        String[] strNumbers = filter.filterInt(strings);
        ArrayCreator creator = new ArrayCreator();
        int numbers[] = creator.factoryArray(strNumbers);
        System.out.println(Arrays.toString(numbers));

        int max = OperationsIntArray.findMax(numbers);
        int min = OperationsIntArray.findMin(numbers);
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }

}
