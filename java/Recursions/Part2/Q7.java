package Recursions.Part2;

public class Q7 {
    public static void main(String[] args){
        int num = 4281;
        reverseNum(num);
        System.out.println(sum);
    }
    static int sum = 0;
    static void reverseNum(int num){
        if(num == 0){
            return;
        }
        int rem = num % 10;
        sum = sum * 10 + rem;
        reverseNum(num/10);
    }
}