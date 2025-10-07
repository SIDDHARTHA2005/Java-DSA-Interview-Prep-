package oopskunal.Oops.oops7.Vector;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("Apple");   
        vector.add("Banana");
        vector.add("Carrot");
        vector.addElement("Mango");

        System.out.println(vector);

        // After removing an vector
        vector.remove(1);
        System.out.println(vector);

        // Inserting an element at certain index
        vector.insertElementAt("Watermelon", 2);
        System.out.println(vector);

        for(String fruits : vector){
            System.out.println(fruits);
        }

        System.out.println(vector.size());      //Size of the inputs taken by the user
        System.out.println(vector.capacity());  //Default Capacity is 10
    }
}
