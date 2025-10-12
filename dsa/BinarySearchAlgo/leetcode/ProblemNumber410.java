package dsa.BinarySearchAlgo.leetcode;

class ProblemNumber410{
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        long result = splitArray(arr, k);
        System.out.println(result);
    }
    static long splitArray(int[] nums, int k){
        long low = 0;
        long high = 0;
        for(int n : nums){
            low = Math.max(low, n);
            high += n;
        }
        long left = low;
        long right = high;
        while(left < right){
            long mid = left + (right - left) / 2;
            if(requiredPieces(nums, mid) <= k){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    static int requiredPieces(int[] nums, long cap){
        int pieces = 1;
        long sum = 0;
        for(int n : nums){
            if(sum + n <= cap){
                sum += n;
            } else {
                pieces++;
                sum = n;
            }
        }
        return pieces;
    }
}