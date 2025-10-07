package oopskunal.encapsulation;

// Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public 
// getter and setter methods to access and modify these variables.

class person{

    private String name;
    private int age;
    private String country;

    public String getName(){        // getter method
        return name;                // returns the value of name
    }
    
    public void setName(String name){  // setter method
        this.name = name;               // sets the value of name
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }
}

public class Details {
    public static void main(String[] args) {
        person p = new person();

        // setting values using setter methods
        p.setName("Sid");
        p.setAge(21);
        p.setCountry("India");

        // getting values using getter methods
        String name = p.getName();
        int age = p.getAge();
        String country = p.getCountry();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);

    }
}
