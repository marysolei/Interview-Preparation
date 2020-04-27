package main

import (
	"fmt"
)

//Question Link:https://leetcode.com/problems/factorial-trailing-zeroes/
func main() {

	fmt.Println(trailingZeroes(1))
	fmt.Println(trailingZeroes(30))
}

func trailingZeroes(n int) int {
	if n/5 == 0 {
		return 0
	}
	return n/5 + trailingZeroes(n/5)

}

func trailingZeroes2(n int) int {
	res := 0
	for n > 0 {
		res += n / 5
		n /= 5
	}
	return res
}
