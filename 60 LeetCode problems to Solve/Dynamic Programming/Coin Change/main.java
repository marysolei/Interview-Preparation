//Question Link: https://leetcode.com/problems/coin-change/

class Solution {
    public int coinChange(int[] coins, int amount) {
        if (coins.length == 0 || amount ==0) return 0;
        int memo[] = new int[amount+1];
        Arrays.fill(memo, amount+1);
        memo[0]=0;
        for (int i =0; i<= amount ; i++) {
          for (int coin:coins) {
            if (coin<= i) {
                memo[i] = Math.min(memo[i], 1+memo[i-coin]);
            }
        }
        }
        return memo[amount]>amount? -1:memo[amount];
    }
}
