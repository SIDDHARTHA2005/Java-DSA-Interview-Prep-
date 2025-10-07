package oopskunal.Oops.abstraction.example1;

public abstract class Parent {

    int age;
    final int VALUE;

    public Parent(int age){  // constructor
        this.age = age;
        VALUE = 20;
    }
    
    abstract void career(String name);
    abstract void partner(String name, int age);

    static void hello(){
        System.out.println("Hello");
    }

    public void fun(){
        System.out.println("I am normal method");
    }

}
