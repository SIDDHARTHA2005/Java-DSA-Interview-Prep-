import java.util.*;

/*
// Binary Search used for Ascending Order of an array
public class BSA {
    public static void main(String[] args){
        int[] arr = {-19, -12, 16, 0, 4, 7, 11, 17, 26, 55};
        int target= 26;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
        int mid = start + (end - start)/2;

            if(arr[mid] > target){
                end = mid - 1;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
*/



/*
// Binary Search used for Descending order of an array
public class BSA {
    public static void main(String[] args) {
        int[] arr = {1 ,2, 3, 5, 7, 8, 9, 10, 19, 24};
        int target = 8; 
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    public static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
*/

/*
// Ceiling of a Number
public class BSA{
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 10;
        int ans = ceilng(arr, target);
        System.out.println(arr[ans]);
    }
    static int ceilng(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] < target){
                start = mid + 1;
            } else if(arr[mid] > target){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
*/

/*
// Floor of a number
public class BSA{
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        double target = 4.9;
        int ans = ceilng(arr, target);
        System.out.println(ans);
    }
    static int ceilng(int[] arr, double target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] < target){
                start = mid + 1;
            } else if(arr[mid] > target){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
*/

/*
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// Problem No: 
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(letters[mid] <= target){
                start = mid + 1;
            }
            else {
                end = mid - 1; 
            }
        }
        return letters[start % letters.length];
    }
}
*/

/*
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Problem No: 34
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1,-1};
        ans[0] = search(nums,target, true);
        if( ans[0] != -1){
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    int search(int[] nums, int target, boolean findfirstindex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<nums[mid]){
                end = mid-1; 
            } else if(target>nums[mid]){
                start = mid+1;
            } else {
                ans = mid;
                if(findfirstindex){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
    */