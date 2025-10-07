package oopskunal.polymorphism;

public class Main {
    public static void main(String[] args) {
        shapes shape = new shapes();
        shapes tri = new triangle();
        circle cir = new circle();      // reference type is circle and object is of circle class
        shapes sq = new square();       // refrenece type is shapes but object is of square class

        shape.area();  // Calls shapes' area method
        tri.area();    // Calls triangle's area method
        cir.area();    // Calls circle's area method
        sq.area();     // Calls square's area method
    }
}
