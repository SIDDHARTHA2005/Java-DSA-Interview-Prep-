import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class DsaArr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        // int[] arr = new int[5];
        // System.out.println(arr[0]); // 0

        // String[] arrr = new String[5];
        // System.out.println(arrr[1]); // null

        // arr[0] = 101;
        // arr[1] = 103;
        // arr[2] = 104;
        // arr[3] = 105;
        // arr[4] = 106;

        // System.out.println(arr[3]);

        // for(int i = 0; i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));  //[1,2,3,4,5]


        // for(int i = 0; i<arr.length;i++){
        //     System.out.print(arr[i] + " ");   // 1 2 3 4 5
        // }

        // String[] str = new String[4];
        // for(int i=0;i<str.length;i++){
        //     str[i] = sc.next();
        // }
        // System.out.println(Arrays.toString(str));
        // str[1] = "Msd";
        // System.out.println(Arrays.toString(str));

        /*  Multi- Dimensional Array
            1 2 3
            4 5 6
            7 8 9
            int[][] arr = new int[3][3];
            or you can write 
            int[][] arr2D = new int[3][];
            or
            int[][] arr = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
            };
        */

        // input
        // int[][] arr2D = new int[3][]; // Declare a 2D array with 3 rows
        // arr2D[0] = new int[3]; //Row 0 has 3 columns
        // arr2D[1] = new int[3]; //Row 1 has 3 columns
        // arr2D[2] = new int[3]; //Row 2 has 3 columns
        // without writing above 3 steps it pops a "Null pointer exception" error
        // System.out.println(arr2D.length); // O/p: 3  //no.of rows

        // int[][] arr = new int[3][3];
        // System.out.println(arr.length);
        // // input
        // for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){  // arr[row].lenght specifies number of columuns in that specific row.
        //         //System.out.println(arr[row].length);
        //         arr[row][col] = sc.nextInt();
        //     }
        // }
        // output
        // for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //         System.out.print(+arr[row][col]+" ");
        //     }
        //     System.out.println();
        // }

        // output using Arrays.toString()
        // for(int row=0;row<arr.length;row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        // Output Enhanced for loop
        // for(int[] a : arr){
        //     System.out.println(Arrays.toString(a));
        // }

        // ArrayList<Integer> list = new ArrayList<>(5);
        // for(int i=0;i<5;i++){
        //     int num = sc.nextInt();
        //     list.add(num);
        // }
        // for(int i=0;i<5;i++){
        //     System.out.println(list.get(i));;
        // }

        /*
        // Swapping of 2 numbers in an array
        int[] arr = {11, 22, 33, 44, 55};
        swap(arr, 0, 2);
        System.out.println(Arrays.toString(arr));

        sc.close();
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        */

        // Maximum value in an array
        /*
        int[] arr = {11,22,33,44,55};
        System.out.println(max(arr));
        
    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
        */
        
        // Maximum value in an array between the range
        int[] arr = {52, 41, 96, 63, 25};
        System.out.println(maxRange(arr,1,3));
                    }
                
    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[start];
        for(int i=start; i<=end;i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}