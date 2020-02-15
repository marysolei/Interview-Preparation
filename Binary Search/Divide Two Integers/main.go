package main

import (
	"fmt"
	"math"
)

//Question Link: https://leetcode.com/problems/divide-two-integers/

func main() {
	dividend := -2147483648
	divisor := -1
	fmt.Println(divide(dividend, divisor))
}

func divide(dividend int, divisor int) int {
	sign := 1
	cnt := 0
	//sign

	if dividend < 0 && divisor < 0 {
		dividend = -1 * dividend
		divisor = -1 * divisor
	} else if dividend < 0 {
		dividend = -1 * dividend
		sign = -1
	} else if divisor < 0 {
		divisor = -1 * divisor
		sign = -1
	}
	for divisor <= dividend {
		dividend -= divisor
		cnt++
	}
	if cnt*sign >= math.MaxInt32 {
		return math.MaxInt32
	} else if cnt*sign < math.MinInt32 {

		return math.MinInt32
	}
	return cnt * sign

}
