package main

import (
	"fmt"
)

//Question Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

func main() {
	in := []int{4, 5, 6, 7, 0, 1, 2}
	fmt.Println(findMin(in))
}

func findMin(nums []int) int {
	if len(nums) == 0 {
		return -1
	}
	l := 0
	r := len(nums) - 1

	for r >= l {
		if nums[l] <= nums[r] {
			return nums[l]
		}
		mid := l + (r-l)/2
		if nums[mid] >= nums[l] {
			l = mid + 1
		} else {
			r = mid
		}
	}
	return -1
}
