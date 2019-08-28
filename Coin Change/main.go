package main

import (
	"fmt"
)

//Question Link:https://leetcode.com/problems/coin-change/

func main() {
	arr := []int{1, 2, 5}
	amount := 11
	fmt.Println(coinChange(arr, amount))
}

func coinChange(coins []int, amount int) int {
	memo := make([]int, amount+1)
	return helper(coins, amount, memo)

}

func helper(coins []int, amount int, memo []int) int {

	for am := 1; am <= amount; am++ {
		memo[am] = -1
		for _, coin := range coins {
			if coin <= am && memo[am-coin] != -1 && (memo[am] == -1 || memo[am-coin]+1 < memo[am]) {
				memo[am] = memo[am-coin] + 1
			}
		}
	}

	return memo[amount]
}
