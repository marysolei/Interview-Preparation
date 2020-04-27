package main

import (
	"fmt"
	"math"
)

//Question Link: https://leetcode.com/problems/increasing-triplet-subsequence/
func main() {
	arr := []int{1, 2, 3, 1, 2, 1}
	fmt.Println(increasingTriplet(arr))
}

func increasingTriplet(nums []int) bool {
	//cnt := 0
	if len(nums) < 3 {
		return false
	}
	first := nums[0]
	second := math.MaxInt64
	for i := 1; i < len(nums); i++ {
		if nums[i] <= first {
			first = nums[i]
		} else if second != math.MaxInt64 && nums[i] > second {
			return true
		} else {
			second = nums[i]
		}
	}
	return false
}
