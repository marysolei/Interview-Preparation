//Question Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1)return 0;

        int maxSum =0;
        for (int i=1; i< prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                maxSum += prices[i] -prices[i-1];
            }
        }
        return maxSum;
    }
}

//Time Complexity: O(n)-> one pass
//Space Complexity: O(1) -> constant space
