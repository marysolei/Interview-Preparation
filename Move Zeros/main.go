package main

import "fmt"

//Question Link: https://leetcode.com/problems/move-zeroes/

func main() {

	arr := []int{0, 12, 0, 3, 14}
	fmt.Println(moveZeroes(arr))
}

func moveZeroes(nums []int) []int {
	cnt := 0
	for i, e := range nums {
		if e != 0 {
			nums[cnt] = nums[i]
			cnt++
		}

	}
	for cnt < len(nums) {
		nums[cnt] = 0
		cnt++
	}
	return nums
}
