package dsa.BinarySearchAlgo.leetcode;

public class ProblemNumber1095 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int ans = FindPeakElement(arr);
        System.out.println(ans);
    }

    int search(int[] arr, int target){
        int peak = FindPeakElement(arr);
        int firstTry = OrderAgnosticBinarySerach(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        int secondTry = OrderAgnosticBinarySerach(arr, target, peak, arr.length-1);
        return secondTry;
    }

    static int FindPeakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int OrderAgnosticBinarySerach(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
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
