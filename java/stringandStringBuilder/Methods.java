package stringandStringBuilder;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        
        String name = "Sri Sai Siddhartha";
        System.out.println(name.toUpperCase());
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println("   Sid   ".strip()); // removes leading and trailing spaces
        System.out.println(Arrays.toString(name.split(" "))); // splits the string by space and returns an array of strings

    }
}
