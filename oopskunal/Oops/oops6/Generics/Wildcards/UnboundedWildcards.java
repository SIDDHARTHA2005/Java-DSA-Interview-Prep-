package oopskunal.Oops.oops6.Generics.Wildcards;

import java.util.*;

public class UnboundedWildcards {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob");
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        
        printList(names);
        printList(numbers);
    }
}
