package oopskunal.inheritance;

public class sedan extends car {
    int bootspace;

    sedan(String brand, int year, int bootspace){
        super(brand, year);
        this.bootspace = bootspace;
    }

    void showdetails(){
        System.out.println("Sedan: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Bootspace: " + bootspace);
    }
}
