package main

import "fmt"

//Question Link: https://leetcode.com/problems/powx-n/

func main() {

	fmt.Println(myPow(2, 3))
}

//O(logn)
func myPow(x float64, n int) float64 {

	if x == 0 {
		return 0
	}
	if n == 0 {
		return 1
	}
	if n < 0 {
		x = 1 / x
		n = -1 * n
	}
	tmp := myPow(x, n/2)
	if n%2 == 0 {
		return tmp * tmp
	}
	return x * tmp * tmp

}
