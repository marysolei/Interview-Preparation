package main

import (
	"fmt"
)

//Question link: https://leetcode.com/problems/valid-mountain-array/

func main() {
	arr := []int{2, 0, 2}
	fmt.Println(validMountainArray(arr))
}

func validMountainArray(A []int) bool {

	if len(A) < 3 {
		return false
	}
	i := 0
	//walk up the hil
	for i+1 < len(A) && A[i] < A[i+1] {
		i++
	}
	//no peak at the biginning or end of array
	if i == 0 || i == len(A)-1 {
		return false
	}
	for i+1 < len(A) && A[i] > A[i+1] {
		i++
	}
	return i == len(A)-1
}
