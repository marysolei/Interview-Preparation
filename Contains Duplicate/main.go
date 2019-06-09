package main

import "fmt"

//Question Link: https://leetcode.com/problems/contains-duplicate/

func main() {

	arr := []int{3, 3}
	fmt.Println(containsDuplicate(arr))
}

func containsDuplicate(nums []int) bool {

	hmap := map[int]int{}
	for _, e := range nums {
		hmap[e]++
	}
	for _, v := range hmap {

		if v > 1 {
			return true
		}
	}
	return false
}
