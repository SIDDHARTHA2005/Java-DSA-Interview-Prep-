package stringandStringBuilder;

public class Performance {
    public static void main(String[] args) {

        // for(int i = 0; i < 26; i++){
        //     char ch = (char)('a' + i);
        //     System.out.print(ch + " ");
        // }

        String series = "";
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            // System.out.print(ch);
            series = series + ch;  // this is very inefficient because Strings are immutable in Java
            // O(N^2) Time Complexity
            // 1+2+3+....N = N*(N+1)/2 = O(N^2)
        }
        System.out.println(series);
    }
}
