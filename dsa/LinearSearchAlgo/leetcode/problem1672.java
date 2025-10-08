package dsa.LinearSearchAlgo.leetcode;

public class problem1672 {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,2,3},
            {4,2,1}
        };
        int ans = Rich(accounts);
        System.out.println(ans);
    }
    static int Rich(int[][] accounts){
        int maxWealth = 0;
        for(int row = 0; row < accounts.length; row++){
            int currentWealth = 0;
            for(int col = 0; col < accounts[row].length; col++){
                currentWealth += accounts[row][col];
            }
            if(currentWealth > maxWealth){
                maxWealth = currentWealth;
            }
        }
        return maxWealth;
    }
}
