package dsa.BinarySearchAlgo;

public class example1 {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -6, -1, 2, 4, 5, 7, 9, 14, 19, 22, 35, 48};
        int target = 48;
        int ans = BinarySearch(arr, target);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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
