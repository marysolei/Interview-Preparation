//Question Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length ==0)return 0;
       // int cursum =0;
        int sum =0;
        for (int i=1; i< prices.length ; i++){
            if (prices[i]- prices[i-1] >0){
                sum+= prices[i]- prices[i-1];
            }
        }
        return sum;
    }

}
