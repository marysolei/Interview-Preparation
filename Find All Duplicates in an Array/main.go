package main

import (
	"fmt"
	"math"
)

//Question link: https://leetcode.com/problems/find-all-duplicates-in-an-array/

func main() {
	arr := []int{4, 3, 2, 7, 8, 2, 3, 1}
	fmt.Println(findDuplicates(arr))
}
func findDuplicates(nums []int) []int {
	res := []int{}
	cnt := make([]int, len(nums)+1)
	for _, e := range nums {
		cnt[e]++
	}
	for i, v := range cnt {
		if v > 1 {
			res = append(res, i)
		}
	}
	return res
}

// needs review
func findDuplicates2(nums []int) []int {
	var res []int
	for i := 0; i < len(nums); i++ {
		index := int(math.Abs(float64(nums[i])))
		if nums[index-1] < 0 {
			res = append(res, index)
		} else {
			nums[index-1] = -nums[index-1]
		}
	}
	return res
}
