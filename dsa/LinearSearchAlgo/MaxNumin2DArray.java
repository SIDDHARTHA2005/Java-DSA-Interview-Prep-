package dsa.LinearSearchAlgo;

import java.util.Arrays;

public class MaxNumin2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {21, 32, 45},
            {9, 21, 76, -21, -123},
            {38, 27, 72, 34, 74, 82},
            {1, 22}
        };
        int ans = MaxNum(arr);
        System.out.println(ans);
    }

    static int MaxNum(int[][] arr){
        if(arr.length == 0){
            return -1;
        }
        // int max = arr[0][0];
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){                // rows
            for(int col = 0; col < arr[row].length; col++){         // col
                if(max < arr[row][col]){
                    max = arr[row][col];  
                }
            }                
        }
        return max;          

    }
}
