package dsa.Arrays.intro;
import java.util.Scanner;
import java.util.Arrays;

public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        System.out.print("Array: ");
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        // for(int row = 0; row < arr.length; row++){
        //     for(int col = 0; col < arr[row].length; col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }
        // for(int row = 0; row < arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        //enchaced for loop
        for(int[] nums : arr){
            System.out.print(Arrays.toString(nums));
            System.out.println();
        }
    }
}