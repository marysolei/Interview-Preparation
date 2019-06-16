package main

import (
	"fmt"
	"math"
)

//Question Link:https://leetcode.com/problems/sqrtx/
func main() {

	fmt.Println(mySqrt1(8))
	fmt.Println(mySqrt2(8))
	fmt.Println(mySqrt3(8))
}

func mySqrt1(x int) int {

	return int(math.Sqrt(float64(x)))
}

func mySqrt2(x int) int {

	return int(math.Pow(float64(x), 0.5))
}

func mySqrt3(x int) int {
	start := 0
	finish := x
	//binary search to find i that i*i<=x
	for start <= finish {
		mid := (start + finish) / 2
		if mid*mid == x {
			return mid
		} else if mid*mid < x {
			start = mid + 1
		} else {
			finish = mid - 1
		}
	}
	return finish

}
