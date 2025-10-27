package Math.Part1;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 2, -4, -1, 3, 1, 6, 4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr){
        int unique = 0;
        for(int num : arr){
            unique ^= num;
        }
        return unique;
    }
}
