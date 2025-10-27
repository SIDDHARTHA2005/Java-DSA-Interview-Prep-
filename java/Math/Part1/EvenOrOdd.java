package Math.Part1;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num = -12;
        findNumber(num);
    }
    static void findNumber(int num){
        if(num % 2 == 0){
            System.out.println("Even");
        } else
        System.out.println("Odd");
    }
}
