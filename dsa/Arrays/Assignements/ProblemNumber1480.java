package dsa.Arrays.Assignements;
import java.util.Arrays;
public class ProblemNumber1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            temp = temp + nums[i];
            ans[i] = temp;
        }
        return ans;
    }
}
