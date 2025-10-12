package dsa.BinarySearchAlgo.leetcode;
// for distinct values/ non repeated values
public class ProblemNumber33{
    public static void main(String[] args) {
        int[] arr = {40, 50, 60, 00, 10, 20, 30};
        int target = 30;
        int start = 0;
        int end = arr.length - 1;
        int result = RotatedBS(arr, target, start, end);
        System.out.println(result);
    }

    public int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        return RotatedBS(arr, target, start, end);
    }

    static int RotatedBS(int[] arr, int target, int start, int end){
        //if not found
        if(start > end){
            return -1;
        }

        // search for sorted array by dividing into two halfs
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }

        // if left half is sorted
        if(arr[start] <= arr[mid]){

            // if target in the left half
            if(target <= arr[mid] && target >= arr[start]){
                return RotatedBS(arr, target, start, mid - 1);
            } else{
                return RotatedBS(arr, target, mid + 1, end);
            }
        }
        // if right half is sorted  
        else {
            
            // if target in the right half
            if(target <= arr[end] && target >= arr[mid]){
                return RotatedBS(arr, target, mid + 1, end);
            } else {
                return RotatedBS(arr, target, start, mid - 1);
            }
        }
    }
}