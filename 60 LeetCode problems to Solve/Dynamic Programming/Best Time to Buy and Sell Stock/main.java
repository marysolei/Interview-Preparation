//Question Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/


class Solution {
    public int maxProfit(int[] prices) {
      if (prices.length ==0) return 0;
        int minv= Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i=0; i< prices.length; i++) {
            if(minv> prices[i]) {
                minv = prices[i];
            } else {
                maxprofit = Math.max(maxprofit,prices[i]-minv);
            }
        }
        return maxprofit;
    }
}
