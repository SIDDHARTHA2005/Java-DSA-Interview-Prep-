package dsa.Arrays.Assignements;

import java.util.ArrayList;
import java.util.Arrays;

public class ProblemNumber1389 {
    public static void main(String[] args) {
        int[] nums = {7,8,9,10,11};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int n = index.length;
        int[] target = new int[n];
        int size = 0;

        for(int i = 0; i < n; i++){
            int position = index[i];
            int value = nums[i];

            // shift the elements
            for(int j = size; j > position; j--){
                target[j] = target[j-1];
            }
            target[position] = value;
            size++;
        }

        return target;

    }
}
