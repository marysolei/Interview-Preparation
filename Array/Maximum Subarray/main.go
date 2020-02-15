package main

import (
	"fmt"
	"math"
)

//Question Link:https://leetcode.com/problems/maximum-subarray/
func main() {
	nums := []int{-2, 1, -3, 4, -1, 2, 1, -5, 4}
	fmt.Println(maxSubArray(nums))
}

func maxSubArray(nums []int) int {

	currSum := nums[0]
	maxSum := nums[0]
	if len(nums) <= 0 {
		return 0
	}
	for i := 1; i < len(nums); i++ {
		if currSum <= 0 {
			currSum = nums[i]
		} else {
			currSum += nums[i]
		}
		maxSum = int(math.Max(float64(currSum), float64(maxSum)))
	}
	return maxSum
}
