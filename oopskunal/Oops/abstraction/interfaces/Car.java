package oopskunal.abstraction.interfaces;

public class Car implements Brake, Engine {
    
    int a = 10;

    @Override
    public void start() {
        System.out.println("Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopping");
    }


    @Override
    public void brake() {
        System.out.println("Engine braking");
    }

    @Override
    public void accelerate() {
        System.out.println("Engine accelerating");
    }
}
