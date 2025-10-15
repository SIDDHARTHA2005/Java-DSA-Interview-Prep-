package dsa.Arrays.Assignements;
import java.util.ArrayList;
import java.util.List;

public class ProblemNumber1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> result = new ArrayList<>(candies.length);
        int maxCandies = 0;
        for (int candy : candies) {
             if(candy > maxCandies)
             maxCandies = candy;
        }

        for (int candy : candies) {
            if((candy + extraCandies) >= maxCandies){
                result.add(true);
            } else{
                result.add(false);
            }
        }
        return result;
    }
}
