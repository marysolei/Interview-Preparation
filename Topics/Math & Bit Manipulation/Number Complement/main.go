package main

import (
	"fmt"
	"math"
)

//Question Link: https://leetcode.com/problems/number-complement/

func main() {

	fmt.Println(findComplement(5))
}

func findComplement(num int) int {
	var arr []int
	res := 0
	for num > 0 {
		t := num % 2
		arr = append(arr, t)
		num /= 2
	}
	for i, e := range arr {
		if e == 0 {
			arr[i] = 1
		} else if e == 1 {
			arr[i] = 0
		}
		res += int(math.Pow(2, float64(i))) * arr[i]
	}
	return res
}
