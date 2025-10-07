package dsa.LinearSearchAlgo;

public class Ex1 {
    public static void main(String[] args) {
        int arr[] = {12, 74, 31, 92, 42, 02, 88, -4, -13};
        int target = 22;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
        
    }

    static int linearSearch(int[] arr, int target){
        // if array is empty return -1
        if(arr.length == 0){
            return -1;
        }
        // search for the target elemet in an array
        for(int index = 0; index < arr.length; index++){
            if(target == arr[index]){
                return index;
            }
        }
        // if target element is not in an array return -1
        return -1;
    }
}
