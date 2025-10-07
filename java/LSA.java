import java.util.*;
// import java.util.Array;
import java.util.Scanner;

/*
// Searching an integer and prints the indexes of an array
public class LSA{
    public static void main(String[] args){
        int[] arr = {11,33,55,33,99,84,63,91,71,10,-7};
        int target = 55;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        // loop
        for(int index=0;index<arr.length;index++){
            int element = arr[index];
            if(element == target){
                return element;
            }
        }
        // if none of the return value is executed in the above statement
        // hence the target not found
        return -1;
    }
}
*/

/*
// Searching a character and prints true/false whether it present or not
public class LSA{
    public static void main(String[] args) {
        String name = "Siddhu";
        char target = 'i';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(linearSearch(name, target));
    }
    static boolean linearSearch(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){    // here it goes to each and every element in the array of string
            if(ch == target){
                return true;
            } 
        }
        return false;   
    }
}
*/

// Serach in range given start and end index and output the index
/*
public class LSA{
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = ;
        System.out.println(linearSearch(arr, target, 1, 3));
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index=start;index<end;index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
*/

// Find the minimum number in an array and outputs the min num
/*
public class LSA{
    public static void main(String[] args) {
        int[] arr = {40,66,88,92,12,74,3,10,3,74};
        System.out.println(minVal(arr));

    }
    static int minVal(int[] arr){
        int ans = arr[0];
        if(arr.length == 0){
            return -1;
        }
        for(int index=1;index<arr.length;index++){
            if(arr[index]<ans){
                ans = arr[index];
            }
        }
        return ans;
    }
}
*/

//Search in 2D Array for an element to print the index of the given element
/*
public class LSA{
    public static void main(String[] args) {
        int[][] arr = new int[][]{
            {23, 4, 1},
            {18, 13, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };
        int target = 9;
        int[] ans = twoDArray(arr, target);
        System.out.println(ans);                // throws a grabage value
        System.out.println(Arrays.toString(ans));
    }

    static int[] twoDArray(int[][] arr, int target){
        if(arr.length == 0){
            return null;
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};    // Note that while returning the index of 2D Array
                }                             // we have to return {new int[]{i,j} here (i and j) are rows and columns}
            }
        }
        return null;                          // or return new int[]{-1 , -1};
    }
}
*/

/*
//Printing max number in a 2D array
public class LSA{
    public static void main(String[] args) {
        int[][] arr = new int[][]{
            {23, 4, 1},
            {18, 13, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };
        System.out.println(twoDArray(arr));
    }

    static int twoDArray(int[][] arr){
        // int max = arr[0][0];
        int max = Integer.MIN_VALUE;
        if(arr.length == 0){
            return 0;
        }

        for(int i=1;i<arr.length;i++){              // for(int[] i : arr){
            for(int j=0;j<arr[i].length;j++){       // for(int j : i){
                if(max < arr[i][j]){                // if(j > max){
                    max = arr[i][j];                // max = j;
                }   
            }                          
        }
        return max;                          
    }
}
*/

// LeetCode Problem Number : 1295

public class LSA{
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num){
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;     //Ex 12/10 = 1.2 in integer it returns 1.
        }
        return count;
    }
}