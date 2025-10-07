package oopskunal.Oops.oops6.Generics.Wildcards;

import java.util.*;

public class LowerBounded {
    public static void addNumbers(List<? super Integer> list) {
        list.add(10); // ✅ safe
        list.add(20);
        // list.add(3.5); ❌ not allowed
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<Number> numList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();

        addNumbers(intList);
        addNumbers(numList);
        addNumbers(objList);
    }
}
