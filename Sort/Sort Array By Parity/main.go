package main

import (
	"fmt"
)

//Question Link: https://leetcode.com/problems/sort-array-by-parity/

func main() {
	arr := []int{3, 1, 2, 4}
	fmt.Println(sortArrayByParity(arr))
}

func sortArrayByParity(A []int) []int {
	var even []int
	var odd []int

	for _, e := range A {
		if e%2 == 0 {
			even = append(even, e)
		} else {
			odd = append(odd, e)
		}
	}
	even = append(even, odd...)

	return even
}
