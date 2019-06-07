package main

import (
	"fmt"
)

//Question Link: https://leetcode.com/problems/single-number/
func main() {
	a := []int{4, 1, 2, 1, 2}
	fmt.Println(singleNumber(a))
	fmt.Println(singleNumber2(a))
}

//n ^ n = 0
//n ^ 0 = n
func singleNumber2(nums []int) int {
	res := 0
	for _, n := range nums {
		res ^= n
	}
	return res
}
func singleNumber(nums []int) int {

	res := 0
	var hmap map[int]int
	hmap = make(map[int]int)
	for _, e := range nums {
		hmap[e]++
	}
	for i := 0; i < len(nums); i++ {
		if hmap[nums[i]] != 2 {
			res = nums[i]
		}
	}
	return res
}
