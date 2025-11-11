package Recursions.Part2;

public class Q2 {
    public static void main(String[] args) {
        int n = 5;
        printIncreasing(n);
    }
    static void printIncreasing(int n){
        if(n == 0){
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }
}
