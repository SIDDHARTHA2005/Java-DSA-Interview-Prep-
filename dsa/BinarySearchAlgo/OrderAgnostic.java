package dsa.BinarySearchAlgo;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 9, 14, 17, 25, 29, 36, 42};
        int[] arr2 = {42, 36, 29, 25, 17, 14, 9, 4, 2};
        int[] arr3 = {};
        int target = 4;
        int ans1 = OrderAgnos(arr1, target);
        int ans2 = OrderAgnos(arr2, target);
        int ans3 = OrderAgnos(arr3, target);
        System.out.println("Array1 target index: " + ans1);
        System.out.println("Array2 target index: " + ans2);
        System.out.println("Empty array: " + ans3);

    }
    static int OrderAgnos(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc) { // Ascending order
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {    // descending order
                if(target < arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
