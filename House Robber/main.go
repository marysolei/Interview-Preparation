package main

import (
	"fmt"
)

//Question Link: https://leetcode.com/problems/house-robber/
func main() {
	nums1 := []int{1, 2, 3, 1}
	fmt.Println(rob(nums1))

}
func rob(nums []int) int {
	even := 0
	odd := 0
	for i, e := range nums {
		if i%2 == 0 {
			even = maxValue(even+e, odd)
		} else {
			odd = maxValue(odd+e, even)
		}
	}
	return maxValue(even, odd)
}

func maxValue(a, b int) int {
	if a > b {
		return a
	}
	return b
}
