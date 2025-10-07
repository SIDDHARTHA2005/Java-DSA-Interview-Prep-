package oopskunal.inheritance;

public class suv extends car{
    public static final String bootspace = null;
    String wheeltype;

    suv(String wheeltype, String brand, int year){
        super(brand, year);
        this.wheeltype = wheeltype;
    }

    void showdetails(){
        System.out.println("SUV Details: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Wheeltype: " + wheeltype);
    }
}