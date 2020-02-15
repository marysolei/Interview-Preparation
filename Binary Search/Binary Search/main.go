package main

import "fmt"

//Question Link: https://leetcode.com/problems/binary-search/
func main() {
	arr := []int{-1, 0, 3, 5, 9, 12}
	target := 9
	fmt.Println(search(arr, target))
}

func search(nums []int, target int) int {
	left := 0
	right := len(nums) - 1
	for left <= right {
		mid := left + (right-left)/2

		if nums[mid] == target {
			return mid
		} else if nums[mid] > target {
			right = mid - 1
		} else if nums[mid] < target {
			left = mid + 1
		}
	}
	return -1
}
