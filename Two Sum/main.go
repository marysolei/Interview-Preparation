package main

import "fmt"

/* Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1]*/

//Question Link: https://leetcode.com/problems/two-sum/
func main() {

	arr := []int{2, 5, 3, 7, 15}
	fmt.Println(twoSum(arr, 9))
	fmt.Println(twoSumHashTable(arr, 9))

}

// two for loops time: O(n^2) space: O(1)
func twoSum(array []int, target int) []int {

	for i, e := range array {
		for j := 1; j < len(array); j++ {
			if e == target-array[j] {
				return []int{i, j}
			}
		}
	}
	return []int{-1, -1}

}

//hash table, time O(n) space O(n)
func twoSumHashTable(nums []int, target int) []int {

	hmap := map[int]int{}
	for i, e := range nums {
		hmap[e] = i
	}
	for j, v := range nums {
		comp := target - v
		if ind, ok := hmap[comp]; ok && ind != j {
			return []int{j, hmap[comp]}
		}
	}
	return []int{}
}
