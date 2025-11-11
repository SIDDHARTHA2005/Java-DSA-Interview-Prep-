package Recursions.Part2;

public class Q5 {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(printDigitsSum(n));
    }
    static int printDigitsSum(int n){
        if(n == 0){
            return 0;
        }
        return (n % 10) + printDigitsSum(n / 10);
    }
}
