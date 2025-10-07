package practiceproblem.OopsW3.W3resourceQ2;

// Write a Java program to create a class called "Dog" with a name and breed attribute. 
// Create two instances of the "Dog" class, set their attributes using the constructor and 
// modify the attributes using the setter methods and print the updated values

public class Main {
    public static void main(String[] args) {
        Dog mydog1 = new Dog("Buddy", "GermanShephard");
        Dog mydog2 = new Dog("Maggie","Beagle");

        System.out.println(mydog1.name);
        System.out.println(mydog2.name);

        //Update values
        mydog1.setName("Yupieee");
        mydog2.setName("Scooby");

        // Printing the updated values
        System.out.println(mydog1.name);
        System.out.println(mydog2.name);
    }
}
