package dsa.Arrays.Assignements;

import java.util.Arrays;

public class ProblemNumber1470 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        for(int i = 0; i < n; i++){
            arr[i * 2] = nums[i];
            arr[i * 2 + 1] = nums[i + n];
        }
        return arr;
    }
}