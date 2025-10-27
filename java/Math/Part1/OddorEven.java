package Math.Part1;

public class OddorEven {
    public static void main(String[] args) {
        int num = 67;
        System.out.println(isOdd(num));
    }
    static boolean isOdd(int num){
        return ((num & 1) == 1);
    }
}
