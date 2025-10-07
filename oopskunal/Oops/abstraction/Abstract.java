package oopskunal.Oops.abstraction;

abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Concrete method ~ Normal method (with body)
    static void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();   // Bark
        cat.sound();   // Meow
        dog.sleep();    // Non-static but not conventional to write but if you want to access it remove static from the method 
        Animal.sleep();   // static method 
        // When you want to share common behavior (like sleep()) but also enforce mandatory behavior (sound() must be defined by every child).
    }
}

