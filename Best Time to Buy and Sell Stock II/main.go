package main

import (
	"fmt"
)

//Question Link:https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
func main() {
	nums := []int{7, 6, 4, 3, 1}
	fmt.Println(maxProfit(nums))
}

func maxProfit(prices []int) int {
	if len(prices) == 0 {
		return 0
	}
	minv := prices[0]
	sum := 0
	for i := 1; i < len(prices); i++ {
		if prices[i]-minv > 0 {
			sum += prices[i] - minv
		}
		minv = prices[i]
	}
	return sum

}

//similar to the one above
func maxProfit2(prices []int) int {

	maxv := 0
	for i := 0; i < len(prices); i++ {
		if prices[i] > prices[i-1] {
			maxv = prices[i] - prices[i-1]
		}
	}
	return maxv
}
