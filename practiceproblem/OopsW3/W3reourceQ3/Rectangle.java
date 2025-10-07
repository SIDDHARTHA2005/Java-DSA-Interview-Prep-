package practiceproblem.OopsW3.W3reourceQ3;

public class Rectangle {
    double width;
    double height;

    void area(){
        double a = width * height;
        System.out.println(a);
    }

    void perimeter(){
        double b = 2 * (width + height);
        System.out.println(b);
    }
}
