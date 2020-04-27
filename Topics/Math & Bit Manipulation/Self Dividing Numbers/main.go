package main

import "fmt"

//Question Link: https://leetcode.com/problems/self-dividing-numbers/

func main() {
	left := 1
	right := 22
	fmt.Println(selfDividingNumbers(left, right))

}

//Time: O((L-R) * logR)
func selfDividingNumbers(left int, right int) []int {
	var arr []int
	for n := left; n <= right; n++ {

		if findSelfDividing(n) {
			arr = append(arr, n)
		}

	}
	return arr
}
func findSelfDividing(n int) bool {
	tmp := n
	for tmp > 0 {

		t := tmp % 10
		tmp = tmp / 10
		if t == 0 || n%t != 0 {
			return false
		}

	}
	return true
}
