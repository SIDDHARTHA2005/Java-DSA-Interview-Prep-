package oopskunal.polymorphism;

public class numbers {
    
    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b;
    }
    // double sum(int a, int b, int c){     // we cannot overload method by changing return type only
    //     return a + b + c ;
    // }
    
    double sum(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        numbers obj = new numbers();
        obj.sum(4,5);
        obj.sum(4,5,6);
        obj.sum(4,5.3);
    }
}