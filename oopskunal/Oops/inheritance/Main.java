package oopskunal.inheritance;

public class Main {
    public static void main(String[] args) {
        sedan s1 = new sedan("BMW", 2025, 4000);
        suv s2 = new suv("Alloy", "Range Rover", 2024);
        
        // Sedan deatils
        s1.showdetails();
        s1.start();
        System.out.println("");
        

        // SUV details
        s2.showdetails();
        s2.stop();
    }
}
