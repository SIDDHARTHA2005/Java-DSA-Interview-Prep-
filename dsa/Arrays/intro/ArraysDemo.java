package dsa.Arrays.intro;
import java.util.Scanner;
import java.util.Arrays;


public class ArraysDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int[] arr = new int[5];

        //  for(int i = 0; i < arr.length; i++){
        //     arr[i] = in.nextInt();
        //  }
        //  for(int j = 0; j < arr.length; j++){
        //     System.out.print(arr[j] + " ");
        //  }

        // // for each loop
        // for(int num : arr){     // num = arr[0], arr[1], arr[2]... 
        //     System.out.println(arr[num] + " ");     // arr[num] = arr[arr[0]], arr[arr[1]]...
        // }

        // Array.toString method
        String[] a = new String[5];
        for(int i = 0; i < a.length; i++){
            a[i] = in.next();
        }
        System.out.println(Arrays.toString(a));
        a[1] = "Sid";
        System.out.println(Arrays.toString(a));
    }
}
