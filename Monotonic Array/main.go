package main

import "fmt"

//Question link: https://leetcode.com/problems/monotonic-array/

func main() {
	arr := []int{1, 2, 2, 3}
	fmt.Println(isMonotonic(arr))
}
func isMonotonic(A []int) bool {
	return increase(A) || decrease(A)
}
func increase(arr []int) bool {
	for i := 0; i < len(arr)-1; i++ {
		if arr[i] > arr[i+1] {
			return false
		}
	}
	return true
}
func decrease(arr []int) bool {
	for i := 0; i < len(arr)-1; i++ {
		if arr[i] < arr[i+1] {
			return false
		}
	}
	return true
}
