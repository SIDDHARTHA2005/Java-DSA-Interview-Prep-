package dsa.LinearSearchAlgo;

public class FindMinNum {
    public static void main(String[] args) {
        int[] arr = {63, -92, 72, 52, 95, 79, 46, 19};
        int ans = FindMinNumber(arr);
        System.out.println(ans);

    }
    static int FindMinNumber(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int min = arr[0];
        for(int index = 1; index < arr.length; index++){
            if(min > arr[index]){
                min = arr[index];
            }
        }
        return min;
    }
}
