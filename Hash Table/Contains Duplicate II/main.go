package main

import (
	"fmt"
)

//Question link: https://leetcode.com/problems/contains-duplicate-ii/

func main() {
	nums := []int{1, 0, 1, 1}
	k := 1
	fmt.Println(containsNearbyDuplicate(nums, k))
}

func containsNearbyDuplicate(nums []int, k int) bool {

	hmap := map[int]int{}
	for i, e := range nums {
		if ind, ok := hmap[e]; ok {
			if i-ind <= k {
				return true
			}
		}
		hmap[e] = i
	}
	return false
}
