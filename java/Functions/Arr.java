import java.util.Arrays;
import java.util.Scanner;

public class Arr{
    public static void main(String args[]){
        
        int[] arr = new int[5];
        // System.out.println(arr[0]); // 0

        // String[] arrr = new String[5];
        // System.out.println(arrr[1]); // null

        // arr[0] = 101;
        // arr[1] = 103;
        // arr[2] = 104;
        // arr[3] = 105;
        // arr[4] = 106;

        Scanner sc = new Scanner(System.in);

        //System.out.println(arr[3]);

        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        //System.out.println(Arrays.toString(arr));

        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}