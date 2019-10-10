package main

import (
	"fmt"
)

//Question link: https://leetcode.com/problems/distribute-candies/

func main() {
	in := []int{0, 0, 0, 4}
	fmt.Println(distributeCandies(in))
}

func distributeCandies(candies []int) int {
	hmap := map[int]int{}
	for i := 0; i < len(candies); i++ {
		hmap[candies[i]]++
	}
	if len(hmap) <= len(candies)/2 {
		return len(hmap)
	}
	return len(candies) / 2
}
