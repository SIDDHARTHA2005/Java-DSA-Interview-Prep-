package practiceproblem.OopsW3.W3resourceQ4;

// Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. 
// Calculate the area and circumference of the circle.

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        System.out.println((int)circle.getArea());
        System.out.println((int)circle.getCircumference());

        // modify using set method
        circle.setRadius(10);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }
}
