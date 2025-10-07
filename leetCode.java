import java.util.*;
import java.util.Arrays;

/*
// Problem Number 1295
// arrays and loops
public class leetCode {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){                 // finds and returns the how many even digit numbers are there in an array
        int count = 0;
        for(int num : nums){
            // int numberOfDigits = digits(num);        // without function call 
            // if(numberOfDigits % 2 == 0){
            //     count++;
            // }
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){                       // return true or false whether the number is even digit or not
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num){                         // counts the number of digits of a particluar number
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;     //Ex 12/10 = 1.2 in integer it returns 1.
        }
        return count;
    }    
}
*/

/*
// Problem Number 1672

public class leetCode {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3},
            {4,5,6},
            {11,22,33},
        };
        System.out.println(Solution(accounts));
    }
    public static int Solution(int[][] accounts){
        int maxWealth = 0;
        for(int row=0;row<accounts.length;row++){
            int currentWealth = 0;
            for(int col=0;col<accounts[row].length;col++){
                currentWealth += accounts[row][col];
            }
            if(currentWealth > maxWealth){
                maxWealth = currentWealth;
            }
        }
        return maxWealth;
    }
}
*/

//Problem Number 744
public class leetCode{
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
    }
    public char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            
        }
    }
}