package stringandStringBuilder;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        
        System.out.println('a' + 'b'); // prints 195 because it adds the ascii values of a and b
        System.out.println("a" + "b"); // prints ab because + is concatenation operator here
        System.out.println("a" + 'b'); // prints ab because here + is concatenation operator
        System.out.println('a' + 3);   // prints 100 because it adds ascii value of a and 3
        System.out.println((char)('a' + 3)); // prints d because it adds ascii value of a and 3 and then converts it into char
        System.out.println("Sid" + new Integer(9));  

        Object ans = new Integer(4) + new ArrayList<>();
        System.out.println(ans);         // it will throw error because + is not defined for Integer and ArrayList
        // left is Integer (a number), right is ArrayList (not a number).
        // Java compiler tries to apply addition — but ArrayList cannot be added to an Integer.
        // Rule atleast one operand must be a String for + to be concatenation operator.


        Object ans1 = new Integer(4) + "" + new ArrayList<>();
        System.out.println(ans1);       // prints 4[] because + is concatenation operator here

    
    }
}
