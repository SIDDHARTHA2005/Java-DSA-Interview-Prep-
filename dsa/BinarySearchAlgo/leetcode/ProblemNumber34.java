package dsa.BinarySearchAlgo.leetcode;

public class ProblemNumber34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,8,8,10};
        int target = 7;
        int[] finalAns = new ProblemNumber34().searchRange(nums, target);
        System.out.println(finalAns[0] + ", " + finalAns[1]);
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if(ans[0] != -1){
        ans[1] = search(nums, target, false);
        }

        return ans;
    }

    int search(int[] nums, int target, boolean findStartIndex){

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if(target > nums[mid]){
                start = mid + 1;
            } else {
                ans = mid;      // instead of returning mid, mid will store the in the variable ans 
                if(findStartIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}