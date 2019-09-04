package main

import "fmt"

//Question Link: https://leetcode.com/problems/find-peak-element/

func main() {
	arr := []int{1, 2, 1, 3, 5, 6, 4}
	fmt.Println(findPeakElement(arr))
}

//O(logn)
func findPeakElement(nums []int) int {
	return bsearch(nums, 0, len(nums)-1)
}
func bsearch(nums []int, l int, r int) int {

	if l == r {
		return l
	}
	mid := l + (r-l)/2
	if nums[mid] > nums[mid+1] {
		return bsearch(nums, l, mid)
	}
	return bsearch(nums, mid+1, r)
}

//O(n)
func findPeakElement2(nums []int) int {
	if len(nums) == 0 {
		return -1
	}
	if len(nums) == 1 {
		return 0
	}

	for i := 0; i < len(nums)-1; i++ {
		if nums[i] > nums[i+1] {
			return i
		}
	}
	return len(nums) - 1
}
