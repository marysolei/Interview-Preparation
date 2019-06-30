package main

import (
	"fmt"
)

//Question Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

func main() {
	in := []int{2, 2, 2, 0, 1}
	fmt.Println(findMin(in))
}

func findMin(nums []int) int {
	if len(nums) == 0 {
		return -1
	}
	if len(nums) == 1 {
		return nums[0]
	}
	l := 0
	r := len(nums) - 1
	for l < r {
		for l < r && nums[l] == nums[l+1] {
			l++
		}
		mid := l + (r-l)/2

		if nums[mid] >= nums[l] && nums[mid] > nums[r] {
			l = mid + 1
		} else {
			r = mid
		}
	}
	return nums[l]
}
