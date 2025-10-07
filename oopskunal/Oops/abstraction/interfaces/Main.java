package oopskunal.abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        
        // Car car = new Car();

        // Engine car = new Car();
        // car.a;                          // Not allowed, because a is not a member of Engine
        // System.out.println(car.a);          // Allowed, because a is a member of Car
        // car.brake();                 // Not allowed, because brake() is not a member of Engine


        // car.start();
        // car.stop();
        // car.accelerate();
        // car.brake();

        // For music dahsboard
        MusicDashboard md = new MusicDashboard();
        md.start();
        md.stop();

        // For electric engine
        ElectricEngine ee = new ElectricEngine();
        ee.start();
        ee.stop();

        // Power Engines
        PowerEngine pe = new PowerEngine();
        pe.stop();
        pe.accelerate();

        //static method of interface
        Media.display();        // call through interface name
        // Media m = new Media();   // Not allowed, because we cannot create object of

    }
}
