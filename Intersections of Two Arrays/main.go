package main

import (
	"fmt"
)

//Question Link: https://leetcode.com/problems/intersection-of-two-arrays/
func main() {
	nums1 := []int{1, 2, 2}
	nums2 := []int{2, 2}
	fmt.Println(intersect(nums1, nums2))

}
func intersect(nums1 []int, nums2 []int) []int {
	hmap := map[int]int{}
	res := []int{}
	for _, e := range nums1 {
		hmap[e]++
	}
	for _, v := range nums2 {
		if hmap[v] != 0 {
			res = append(res, v)
			hmap[v] = 0
		}

	}
	return res
}
