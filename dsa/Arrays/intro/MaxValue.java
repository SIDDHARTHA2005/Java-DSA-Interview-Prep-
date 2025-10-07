package dsa.Arrays.intro;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {22, 26, 73, 91, 62};
        System.out.println(FindingMaxVal(arr));
    }
    static int FindingMaxVal(int arr[]){
        int maxVal = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxVal){
               maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
