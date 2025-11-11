package Recursions.Part2;

public class Q3 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFactorial(n));
    }
    static int printFactorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * printFactorial(n - 1);
    }
}
