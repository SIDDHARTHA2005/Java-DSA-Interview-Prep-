package dsa.Sorting.Leetcode.Practice;

public class ProblemNumber645 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] res = findErrorNums(nums);
        System.out.println("[" + res[0] + "," + res[1] + "]");
    }
    public static int[] findErrorNums(int[] nums) {
        int a = 0, b = 0;
        int i = 0;
        while (i < nums.length) {
                int elementpos = nums[i] - 1;
                if(nums[i] != nums[elementpos]){
                    swap(nums, i , elementpos);
                }else 
                 i++;
        }   
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                a = nums[index];
                b = index + 1;
            }
        }
        return new int[]{a,b};
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
