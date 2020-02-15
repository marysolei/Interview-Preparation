package main

import (
	"fmt"
)

//Question Link: https://leetcode.com/problems/missing-number/
func main() {

	arr := []int{0, 1, 3}
	fmt.Println(missingNumber1(arr))
	fmt.Println(missingNumber2(arr))
}

//time: O(n)
//space: O(1)
func missingNumber1(nums []int) int {
	sum := 0
	l := len(nums)
	for _, e := range nums {
		sum += e
	}

	return ((l * (l + 1)) / 2) - sum

}

//time: O(n)
//space: O(n)
func missingNumber2(nums []int) int {

	hmap := map[int]int{}
	for _, e := range nums {
		hmap[e]++
	}
	for i := 0; i < len(nums)+1; i++ {
		if _, ok := hmap[i]; !ok {
			return i
		}
	}
	return -1
}
