package oopskunal.Oops.oops7.Enums;
// import java.lang.enum;

enum Signals {
    RED, YELLOW, GREEN
    // everthing is public static and final
    // since its final we cannot create child enums
}

public class TrafficLight {
    public static void main(String[] args) {
        Signals light = Signals.RED;

        //switch case
        switch (light) {
            case RED:
                System.out.println("STOP!");
                break;
            case YELLOW:
            System.out.println("SLOW>");
                break;
            case GREEN:
            System.out.println("Goo");
            break;
        }
    }    
}
