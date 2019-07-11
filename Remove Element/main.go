package main

import "fmt"

//Question link: https://leetcode.com/problems/remove-element/

func main() {
	nums := []int{0, 1, 2, 2, 3, 0, 4, 2}
	fmt.Println(removeElement(nums, 2))
}

func removeElement(nums []int, val int) int {
	ind := 0
	for ind < len(nums) {
		if nums[ind] == val {
			nums = append(nums[:ind], nums[ind+1:]...)
		} else {
			ind++
		}
	}
	//fmt.Println("nums", nums)
	return len(nums)
}
