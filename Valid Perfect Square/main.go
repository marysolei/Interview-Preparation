package main

import (
	"fmt"
)

//Question link: https://leetcode.com/problems/valid-perfect-square/

func main() {
	fmt.Println(isPerfectSquare(16))
}

func isPerfectSquare(num int) bool {
	if num == 1 {
		return true
	}
	start, mid, end := 0, 0, num
	for start <= end {
		mid = (start + end) / 2
		if mid*mid == num {
			return true
		} else if mid*mid > num {
			end = mid - 1
		} else {
			start = mid + 1
		}

	}
	return false
}
