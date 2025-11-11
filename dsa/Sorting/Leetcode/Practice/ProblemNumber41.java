package dsa.Sorting.Leetcode.Practice;

public class ProblemNumber41 {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 0};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctpos = nums[i] - 1;       // correct position of the current element
                if(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correctpos]){
                swap(nums, i, correctpos);
                } else {
                    i++;
                }
        }
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index+1){
                return index+1;
            }
        }
        return nums.length+1;
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
