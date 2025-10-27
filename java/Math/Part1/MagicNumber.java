package Math.Part1;
// Amazon Interview Question

public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;
        
        int ans = 0;
        int base = 5;

        while (n > 0) {
            int last = n & 1;       // 110 & 001 = 0
            n = n >> 1;             // 110 >> 1 = 011
            ans += last * base;     // 0 * 5 = 0
            base = base * 5;        // 5 * 5 = 25
        }

        System.out.println(ans);
    }   
}
