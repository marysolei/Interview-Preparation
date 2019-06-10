package main

import (
	"fmt"
	"math"
)

//Question Link:https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
func main() {
	nums := []int{7, 1, 5, 3, 6, 4}
	fmt.Println(maxProfit(nums))
}

//O(n)
func maxProfit(prices []int) int {

	minv := math.MaxInt16
	maxv := 0
	for i := 0; i < len(prices); i++ {

		if prices[i] < minv {
			minv = prices[i]
		} else if prices[i]-minv > maxv {
			maxv = prices[i] - minv

		}
	}

	return maxv
}

//O(n^2)

func maxProfit2(prices []int) int {
	maxv := 0
	for i := 0; i < len(prices); i++ {
		for j := i + 1; j < len(prices); j++ {
			if prices[j]-prices[i] > maxv {
				maxv = prices[j] - prices[i]
			}
		}
	}
	return maxv
}
