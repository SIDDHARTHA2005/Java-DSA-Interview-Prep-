package oopskunal.Oops.oops6.Generics.Wildcards;

import java.util.*;

public class UpperBounded {
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.1, 2.2);

        printNumbers(intList);
        printNumbers(doubleList);
    }
}

