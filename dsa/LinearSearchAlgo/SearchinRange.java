package dsa.LinearSearchAlgo;

public class SearchinRange {
    public static void main(String[] args) {
        int arr[] = {12, 42, 24, 63, 94, 49};
        int target = 94;
        int start = 1;
        int end = 4;
        int ans = Search(arr, start, end, target);
        System.out.println(ans);
    }
    static int Search(int[] arr, int start, int end, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index = start; index <= end; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
