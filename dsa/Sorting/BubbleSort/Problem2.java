package dsa.Sorting.BubbleSort;


public class Problem2 {
    public static void main(String[] args) {
        String alp = "csiplearninghub";
        BubbleSort(alp);
        System.out.print("[");
        for(int i = 0; i < alp.length(); i++){
            System.out.print(alp.charAt(i) + " ");
        }
        System.out.println("]");
    }
    static void BubbleSort(String alp){
        boolean swapped;
        char[] arr = alp.toCharArray();
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] > arr[j-1]){
                    char temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
            break; 
            }
        }
    }
}
