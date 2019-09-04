package main

import (
	"fmt"
	"math"
)

//Question Link:https://leetcode.com/problems/first-missing-positive/

func main() {

	arr := []int{7, 8, 9, 11, 12}
	fmt.Println(firstMissingPositive(arr))
}

func firstMissingPositive(nums []int) int {
	if nums == nil || len(nums) == 0 {
		return 1
	}
	hmap := map[int]bool{}
	maxv := math.MaxInt64
	for _, e := range nums {
		hmap[e] = true
	}

	for i := 1; i < maxv; i++ {
		if _, ok := hmap[i]; ok {
			continue
		} else {
			return i
		}
	}
	return -1

}
