package dsa.LinearSearchAlgo;

public class MinNumin2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {21, 32, 45},
            {9, 21, 76, -21, -123},
            {38, 27, 72, 34, 74, 82},
            {1, 22}
        };
        int ans = MinNum(arr);
        System.out.println(ans);
    }

    static int MinNum(int[][] arr){
        if(arr.length == 0){
            return -1;
        }
        int min = arr[0][0];
        for(int row = 0; row < arr.length; row++){                // rows
            for(int col = 0; col < arr[row].length; col++){         // col
                if(min > arr[row][col]){
                    min = arr[row][col];  
                }
            }                
        }
        return min;          

    }
}
