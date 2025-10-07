package practiceproblem.OopsW3.W3resourceQ1;

// Q) Write a Java program to create a class called "Person" with a name and age attribute.
// Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

/*
// Method 1
public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Person p1 = new Person("Nipuna", 21);
        Person p2 = new Person("Sid", 24);
        
        System.out.println("Her name is " + p1.name + " and her age is " + p1.age);
        System.out.println("My name is " + p2.name + " and my age is " + p2.age);
    }
}
*/

// Method 2
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Nipuna",20);
        Person person2 = new Person("Siddhartha", 21);

        // Printing names and ages
        System.out.println("Printing names :");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

        System.out.println("Their ages are :");
        System.out.println(person1.getAge());
        System.out.println(person2.getAge());

        // Modifing names and ages
        System.out.println("Modified names are :");
        person1.setName("Ankith");
        person2.setName("Bheeshma");

        System.out.println("Modified agess are :");
        person1.setAge(44);
        person2.setAge(47);

        // Printing the modifing names and ages
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        
        System.out.println(person1.getAge());
        System.out.println(person2.getAge());

    }
}