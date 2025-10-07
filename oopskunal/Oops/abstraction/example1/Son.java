package oopskunal.Oops.abstraction.example1;

public class Son extends Parent{

    public Son(int age){   // call parent constructor
        super(age);         // super must be the first statement
    } 

    @Override
    void career(String name){  // method body
        System.out.println("I want to be a " + name);
    }

    @Override
    void partner(String name, int age){
        System.out.println("I love " + name + " and her age is " + age);
    }

}
