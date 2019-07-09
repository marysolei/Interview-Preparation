package main

import (
	"fmt"
	"sort"
)

//Question link: https://leetcode.com/problems/set-mismatch/

func main() {
	arr := []int{1, 1}
	fmt.Println(findErrorNums(arr))
}

//O(nlogn)
func findErrorNums(nums []int) []int {

	//sorting the array
	sort.Ints(nums)
	dup, miss := -1, 1
	for i := 1; i < len(nums); i++ {
		if nums[i-1] == nums[i] {
			dup = nums[i]
		} else if nums[i] > nums[i-1]+1 {
			miss = nums[i-1] + 1
		}
	}
	if nums[len(nums)-1] != len(nums) {
		return []int{dup, len(nums)}
	}
	return []int{dup, miss}
}

//O(n) using a map
func findErrorNums2(nums []int) []int {
	hmap := map[int]int{}
	dup := -1
	miss := -1
	for _, e := range nums {
		hmap[e]++
	}
	fmt.Println(hmap)
	for n := 1; n <= len(nums); n++ {
		if _, ok := hmap[n]; ok {
			if hmap[n] == 2 {
				dup = n
			}
		} else {
			miss = n
		}
	}
	return []int{dup, miss}

}
