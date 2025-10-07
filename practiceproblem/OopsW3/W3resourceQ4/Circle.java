package practiceproblem.OopsW3.W3resourceQ4;

public class Circle {
    final double pie = 3.14;
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return pie*radius*radius;
    }

    public double getCircumference(){
        return 2*pie*radius;
    }

}
