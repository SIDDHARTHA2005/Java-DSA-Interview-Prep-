package dsa.Arrays.Assignements;
import java.util.Arrays;

public class ProblemNumber1929 {
    public static void main(String[] args) {
    int[] nums = {1,4,5,2,1};
    System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    static int[] getConcatenation(int[] nums) {
        // Solution 2
        int n = nums.length;
        int[] ans = new int[n * 2];
        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);
/*
        // Solution 1
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
        }
        int index = nums.length;
        for(int i = 0; i < nums.length; i++){
            ans[index] = nums[i];
            index++;
        }
*/
/*
        // SOlution 3
        for(int i=0;i<n;i++){
         ans[i]=nums[i];
         ans[i+n]=nums[i];
        }
*/
        return ans;
    }
}
