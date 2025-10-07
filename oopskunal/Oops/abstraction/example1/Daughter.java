package oopskunal.Oops.abstraction.example1;

public class Daughter extends Parent {

    public Daughter(int age){
        super(age);     
    }
    
    @Override
    void career(String name){
        System.out.println("I want to be a " + name);
    }

    @Override
    void partner(String name, int age){
        System.out.println("I love " + name + " and her age is " + age);
    }
}

