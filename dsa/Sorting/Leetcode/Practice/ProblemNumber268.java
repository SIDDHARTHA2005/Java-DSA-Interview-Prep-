package dsa.Sorting.Leetcode.Practice;

public class ProblemNumber268 {
    public static void main(String[] args) {
        int[] arr = {3,0,1};    // O/P : 2 Missing Number
        // System.out.println(missingNumber(arr));
        System.out.println(miss(arr));
    }
    public static int missingNumber(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correctElement = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctElement]){
                swap(arr, i, correctElement);
            } else {
                i++;
            }
        }
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

// Alternative approach ~ Fastest Way 
    public static int miss(int[] nums){
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int array_sum = 0;

        for(int i = 0; i < n; i++){
            array_sum += nums[i];
        }
        return sum - array_sum;
    }
}