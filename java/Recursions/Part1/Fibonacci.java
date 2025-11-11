package Recursions.Part1;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(3));
        // System.out.println(fibFormula(50));
    }

    static int fibFormula(int n){
        return (int) (Math.pow((1 + Math.sqrt(5)/2), n) / Math.sqrt(5));
    }

    static int fib(int n){
        // base condition
        if(n < 2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
