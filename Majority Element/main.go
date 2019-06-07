package main

import (
	"fmt"
	"math"
)

func main() {

	arr := []int{3, 2, 3}
	fmt.Println(majorityElement(arr))
}

//Question Link : https://leetcode.com/problems/majority-element/

func majorityElement(nums []int) int {
	res := 0
	v := int(math.Floor(float64((len(nums) / 2))))
	hmap := map[int]int{}
	for _, e := range nums {
		hmap[e]++
	}

	for _, s := range nums {
		if hmap[s] > v {
			res = s
		}
	}
	return res
}
