package main

import (
	"fmt"
	"math"
)

//Question Link : https://leetcode.com/problems/degree-of-an-array/

func main() {
	arr := []int{1, 2, 2, 3, 1, 4, 2}
	fmt.Println(findShortestSubArray(arr))
}

func findShortestSubArray(nums []int) int {
	hmap := map[int]int{}
	minind := map[int]int{}
	max := 0
	//el := 0
	cnt := 0
	for i, e := range nums {
		hmap[e]++
		if _, ok := minind[e]; !ok {
			minind[e] = i
		}
		if hmap[e] > max {
			max = hmap[e]
			cnt = i - minind[e] + 1
		}
		if max == hmap[e] {
			cnt = int(math.Min(float64(cnt), float64(i-minind[e]+1)))
		}
	}
	return cnt

}
