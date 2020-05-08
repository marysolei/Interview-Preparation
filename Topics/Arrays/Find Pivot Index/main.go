package main

import "fmt"

//Question link: https://leetcode.com/problems/find-pivot-index/

func main() {
	arr := []int{1, 7, 3, 6, 5, 6}
	fmt.Println(pivotIndex(arr))
}

func pivotIndex(nums []int) int {
	sum := 0
	leftsum := 0
	for _, e := range nums {
		sum += e
	}
	for i := 0; i < len(nums); i++ {
		if leftsum == sum-leftsum-nums[i] {
			return i
		}
		leftsum += nums[i]
	}
	return -1
}
