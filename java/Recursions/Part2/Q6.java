package Recursions.Part2;

public class Q6 {
    public static void main(String[] args) {
        int n = 55;
        System.out.println(printDigitsProd(n));
    }
    static int printDigitsProd(int n){
        if(n%10 == n){
            return n;
        }
        return (n % 10) * printDigitsProd(n / 10);
    }
}
