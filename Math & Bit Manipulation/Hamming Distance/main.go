package main

import (
	"fmt"
)

//Question Link: https://leetcode.com/problems/hamming-distance/

func main() {

	fmt.Println(hammingDistance(1, 4))

}

func hammingDistance(x int, y int) int {

	cnt := 0
	for x > 0 && y > 0 {
		if x%2 != y%2 {
			cnt++
		}
		x /= 2
		y /= 2
	}
	for x > 0 {
		cnt = cnt + x%2
		x /= 2
	}
	for y > 0 {
		cnt = cnt + y%2
		y /= 2
	}
	return cnt
}

//easier way of doing it, found online
func hammingDistance2(x int, y int) int {
	z := x ^ y
	cnt := 0
	for z > 0 {
		if z%2 == 1 {
			cnt++
		}
		z /= 2
	}
	return cnt
}
