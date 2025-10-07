package dsa.LinearSearchAlgo;
import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {21, 32, 45},
            {9, 21, 76, -21, -123},
            {38, 27, 72, 34, 74, 82},
            {1, 22}
        };
        int target = 82;
        int[] ans = Searchingin2D(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Searchingin2D(int[][] arr, int target){
        if(arr.length == 0){
            return new int[] {-1,-1};
        }
        for(int row = 0; row < arr.length; row++){                // rows
            for(int col = 0; col < arr[row].length; col++){         // col
                if(target == arr[row][col]){
                    return new int[]{row,col};  // creating a new object
                }
            }                
        }
        return new int[] {-1, -1};          // to return creating a new object here
    }
}
