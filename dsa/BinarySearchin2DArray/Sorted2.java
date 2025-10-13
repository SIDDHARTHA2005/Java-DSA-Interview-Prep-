package dsa.BinarySearchin2DArray;

public class Sorted2 {
    public static void main(String[] args) {
     int[][] arr =  new int[][]{
        {1,2,3,4,5},
        {15,16,17,18,20},
        {19,110,111,112}
    }; 
    int target = 112;   
    System.out.println(search(arr, target));

    }

    static boolean search(int[][] mat, int target){
        int n = mat.length;
        int m = mat[0].length;
        int low = 0, high = n * m -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            int row = mid/m;
            int col = mid%m;
            if(mat[row][col] == target){
                return true;
            } else if(mat[row][col] < target){
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        return false;
    }
}
