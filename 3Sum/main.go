package main

import "sort"

//Question Link:https://leetcode.com/problems/3sum/

func main() {

}
func threeSum(nums []int) [][]int {
	res := [][]int{}
	sort.Ints(nums)
	n := len(nums)
	for i := 0; i < n-2; i++ {
		//// Never let i refer to the same value twice to avoid duplicates.
		if i != 0 && nums[i] == nums[i-1] {
			continue
		}
		a := nums[i]
		start := i + 1
		end := n - 1
		for start < end {
			b := nums[start]
			c := nums[end]
			if a+b+c == 0 {
				res = append(res, []int{a, b, c})

				//Continue searching for all triplet combinations summing to zero.
				// We need to update both end and start together since the array values are distinct.
				start++
				// Never let start refer to the same value twice (in an output) to avoid duplicates
				for start < end && nums[start] == nums[start-1] {
					start++
				}
			} else if a+b+c > 0 {
				end--
			} else {
				start++
			}
		}
	}
	return res
}
