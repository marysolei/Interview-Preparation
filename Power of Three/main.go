package main

import (
	"fmt"
	"math"
)

//Question Link:https://leetcode.com/problems/power-of-three/
func main() {
	fmt.Println(isPowerOfThree(27))

}

func isPowerOfThree(n int) bool {
	if n < 1 {
		return false
	}

	for n%3 == 0 {
		n /= 3
	}

	if n == 1 {
		return true
	}
	return false
}
func isPowerOfThree2(n int) bool {
	res := (math.Log10(float64(n)) / math.Log10(float64(3)))
	fmt.Println(res)
	if math.Mod(res, 1) == 0 {
		return true
	}
	return false
}
