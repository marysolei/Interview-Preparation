package main

import (
	"fmt"
)

//Question Link: https://leetcode.com/problems/product-of-array-except-self/
func main() {
	nums1 := []int{1, 2, 3, 4}
	fmt.Println(productExceptSelf(nums1))

}
func productExceptSelf(nums []int) []int {
	n := len(nums)
	l := make([]int, n)
	r := make([]int, n)
	res := make([]int, n)
	l[0] = 1
	r[n-1] = 1
	for i := 1; i < n; i++ {
		l[i] = l[i-1] * nums[i-1]
	}
	for j := n - 2; j >= 0; j-- {
		r[j] = r[j+1] * nums[j+1]
	}
	for k := 0; k < n; k++ {
		res[k] = l[k] * r[k]
	}
	return res
}
