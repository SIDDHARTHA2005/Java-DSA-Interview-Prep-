package oopskunal.inheritance;

public class car {
    String brand;
    int year;

    car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    void start(){
        System.out.println(this.brand + " (" + this.year + ") " + "car is starting");
    }
    void stop(){
        System.out.println(this.brand + " car is stopping");
    }
}
