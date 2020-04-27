package main

import (
	"fmt"
	"sort"
)

//Question Link: https://leetcode.com/problems/find-the-duplicate-number/

func main() {
	arr := []int{3, 1, 3, 4, 2}
	fmt.Println(findDuplicate(arr))
}

func findDuplicate(nums []int) int {
	if len(nums) == 0 {
		return -1
	}
	sort.Ints(nums)
	for i := 0; i < len(nums)-1; i++ {
		if nums[i] == nums[i+1] {
			return nums[i]
		}
	}
	return -1
}
