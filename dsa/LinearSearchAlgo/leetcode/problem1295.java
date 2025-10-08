package dsa.LinearSearchAlgo.leetcode;

public class problem1295 {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums){                 // finds and returns the how many even digit numbers are there in an array
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numOfDigits = digits(num);
        return numOfDigits % 2 == 0;
    }

    static int digits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
