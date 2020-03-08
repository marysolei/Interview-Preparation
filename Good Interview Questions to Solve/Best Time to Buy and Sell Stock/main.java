//Question Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <=1 ) return 0;
        int maxProfit = 0 ;
        int currentProfit = 0;
        int minPrice = prices[0];
        for (int i=0; i < prices.length ; i++){
            if (prices[i]< minPrice) {
                minPrice = prices[i];
            }
            currentProfit = prices[i]- minPrice ;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}
//Time complexity : O(n) Only a single pass is needed.
//Space complexity : few variables are introduced
