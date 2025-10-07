package stringandStringBuilder;

public class SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sid");
        System.out.println(sb);  // prints Sid

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            builder.append(ch); // appends ch to the builder
        }
        System.out.println(builder); // prints abcdefghijklmnopqrstuvwxyz
        System.out.println(builder.length()); // prints 26
        System.out.println(builder.charAt(0)); // prints a
        System.out.println(builder.indexOf("c")); // prints 2
    }
}
