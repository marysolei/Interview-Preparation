package main

import (
	"fmt"
	"math"
)

//Question Link:https://leetcode.com/problems/happy-number/
func main() {

	fmt.Println(isHappy(1))
}

func isHappy(n int) bool {

	//we need a criteria to avoid the infinite loop here -> check func w/o record for 2
	record := map[int]bool{}
	for record[n] != true {
		record[n] = true
		n = calculation(n)
		if n == 1 {
			return true
		}
	}
	return false
}
func calculation(n int) int {
	res := 0
	for n > 0 {
		f := n % 10
		n = n / 10
		res += int(math.Pow(float64(f), 2))
	}
	return res
}
