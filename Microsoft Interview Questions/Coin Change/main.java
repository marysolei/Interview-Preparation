//Question Link:https://leetcode.com/problems/coin-change/

class Solution {
    public int coinChange(int[] coins, int amount) {
        if (coins.length == 0 || amount ==0) return 0;
        Arrays.sort(coins);
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for (int i=1; i<= amount ; i++) {
            for (int coin : coins) {
                if (coin<= i){
                    dp[i] = Math.min(dp[i], dp[i-coin] +1);
                }  else {
                    break;
                }
            }
        }
        return dp[amount] >amount? -1: dp[amount];
    }
}
//Time Complexity: O(m*n) -> m is the amount , n is the #of coins
//Space Complexity: O(m) -> m is the amount 
