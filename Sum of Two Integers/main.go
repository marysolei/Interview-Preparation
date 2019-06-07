package main

import (
	"fmt"
)

//Question Link: https://leetcode.com/problems/sum-of-two-integers/

func main() {

	fmt.Println(getSum(3, 4))
}

func getSum(a int, b int) int {

	for b != 0 {
		// carry ? & of two bits (a&b)
		carry := a & b
		//a XOR b = sum of two bits
		a = a ^ b
		//shift carry to 1bit for calculating sum
		b = carry << 1
	}
	return a

}
