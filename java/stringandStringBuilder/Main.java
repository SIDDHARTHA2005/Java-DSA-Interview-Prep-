package stringandStringBuilder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String name1 = "Sri";       // String objects cannot change
        // System.out.println(name1);   

        name1 = "Sai";      // Creating a new object
        // System.out.println(name1);

        // Comparison of strings 
        String x = "Hello";
        String y ="Hello";
        // System.out.println(x == y);     // true, both refer to same object in string pool

        String a = new String("Siddhartha");
        String b = new String("Siddhartha");
        System.out.println(a == b);     // false, both refer to different objects in heap memory
        System.out.println(a.equals(b));    // true, compares values

        System.out.println(Arrays.toString(new int[] {1, 2, 3, 4, 5}));

        // Wrapper class
        Integer i = new Integer(55);   // deprecated way of creating integer object
        Integer j = 45;     // autoboxing
        int k = j;      // unboxing
        System.out.println(i);    // printing object
        System.out.println(j);   // printing object
        System.out.println(k);  // printing primitive
        System.out.println(i + j + k);     // unboxing 
        System.out.println(i.floatValue());

    }
}
