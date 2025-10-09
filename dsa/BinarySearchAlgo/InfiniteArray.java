package dsa.BinarySearchAlgo;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {
            2, 3, 6, 9, 13, 18, 23, 27, 
            31, 47, 52, 68, 72, 74
    };
        int target = 74;
        int ans = findingAns(arr, target);
        System.out.println(ans);
        
    }

    static int findingAns(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;     // this is my new start
            end = end + (start - end + 1) * 2;
            start = temp;
        }
        return BinarySearch(arr, target, start,end);
    }

    static int BinarySearch(int[] arr,int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
