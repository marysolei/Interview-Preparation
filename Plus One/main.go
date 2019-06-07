package main

import (
	"fmt"
)

func main() {

	arr := []int{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6}
	fmt.Println(plusOne(arr))
}

//Question Link : https://leetcode.com/problems/plus-one/

func plusOne(digits []int) []int {
	carry := 1
	res := make([]int, len(digits)+1)
	l := len(digits) - 1
	for i := l; i >= 0; i-- {
		sum := digits[i] + carry
		digits[i] = sum % 10
		carry = sum / 10
	}
	if carry > 0 {
		res[0] = carry
		copy(res[1:], digits)
		return res

	}
	return digits
}
