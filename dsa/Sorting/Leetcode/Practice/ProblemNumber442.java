package dsa.Sorting.Leetcode.Practice;
import java.util.ArrayList;
import java.util.List;

public class ProblemNumber442 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates4(nums));
    }
    public static List<Integer> findDuplicates4(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int elementpos = nums[i] - 1;
            if(nums[i] != nums[elementpos]){
                swap(nums, i , elementpos);
        } else {
            i++;
        }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                ans.add(nums[index] );
            }
        }
        return ans; 
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
