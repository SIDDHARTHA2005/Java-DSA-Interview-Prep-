package dsa.BinarySearchin2DArray;

import java.util.Arrays;

public class TargetSearch {
    public static void main(String[] args) {
        int[][] arr = {
        {10, 20, 30, 40},
        {15, 25, 35, 45},
        {17, 27, 37, 48},
        {19, 29, 39, 50},
    };
        int target = 50;
        int[] ans = search(arr, target);
       System.out.println(Arrays.toString(ans));    
    }
    static int[] search(int[][] matrix, int target){
        /*
        // Solution 1
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(target == matrix[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        */

        // Solution 2
        int r = 0;
        int c = matrix.length - 1;

        while(r < matrix.length && c>=0){
            if(target == matrix[r][c]){
                return new int[]{r,c};
            }
            if(matrix[r][c] <  target){
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}