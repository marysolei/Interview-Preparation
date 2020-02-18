package main 
//Question Link: https://leetcode.com/problems/search-insert-position/

func searchInsert(nums []int, target int) int {
    if len(nums) == 0 {
		return 0
	}
	mid := 0
	left := 0
	right := len(nums) - 1
	for left <= right {
		mid = left + (right-left)/2
		if nums[mid] == target {
			return mid
		} else if nums[mid] < target {
			left = mid + 1
		} else if nums[mid] > target {
			right = mid - 1
		}
	}
	if nums[mid] < target {
		return mid + 1
	}
	return mid
}
