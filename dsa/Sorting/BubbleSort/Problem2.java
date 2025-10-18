package dsa.Sorting.BubbleSort;

public class Problem2 {
    public static void main(String[] args) {
        String str = "csiplearninghub";
        char[] arr = str.toCharArray(); // convert string to char array

        int n = arr.length;
        boolean swapped;

        // Bubble sort in descending order
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // '<' for descending order
                    // swap
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // optimization: stop if already sorted
        }

        // Print the sorted array
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print("'" + arr[i] + "'");
            if (i != n - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}

}
