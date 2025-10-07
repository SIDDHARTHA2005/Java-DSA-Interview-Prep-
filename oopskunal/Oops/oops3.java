package oopskunal.Oops;

public class oops3 {  // oops3 as box
    double l;
    double h;
    double w;

    oops3(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // cube
    oops3(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    oops3(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
}
