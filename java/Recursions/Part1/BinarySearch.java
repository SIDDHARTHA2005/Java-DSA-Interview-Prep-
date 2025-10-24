package Recursions.Part1;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {11, 22, 33, 46, 58, 68, 71, 80};
        int target = 11;
        System.out.println(search(nums, target, 0, nums.length - 1));
    }

    static int search(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s)/2;
        
        if(arr[m] == target){
            return m;
        }

        if(target < arr[m]){
            return search(arr, target, s, m - 1);
        }
        return search(arr, target, m + 1, e);

    }
}
