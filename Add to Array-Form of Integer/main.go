package main

import (
	"fmt"
)

//Question link: https://leetcode.com/problems/add-to-array-form-of-integer/

func main() {
	A := []int{2, 1, 5}
	fmt.Println(addToArrayForm(A, 806))
}

func addToArrayForm(A []int, K int) []int {
	var res []int

	for i := len(A) - 1; i >= 0; i-- {
		res = append(res, (A[i]+K)%10)
		K = (A[i] + K) / 10
	}
	for K > 0 {
		res = append(res, K%10)
		K /= 10
	}
	//fmt.Println("res", res)
	for i, j := 0, len(res)-1; i < j; i, j = i+1, j-1 {
		res[i], res[j] = res[j], res[i]
	}
	return res
}
