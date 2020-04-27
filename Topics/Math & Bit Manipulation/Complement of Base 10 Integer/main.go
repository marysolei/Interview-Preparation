package main

import (
	"fmt"
	"strconv"
)

//Question link: https://leetcode.com/problems/complement-of-base-10-integer/

func main() {

	fmt.Println(bitwiseComplement(7))

}

//saw the method online
func bitwiseComplement(N int) int {
	bin := fmt.Sprintf("%b", N)
	num := ""
	for _, e := range bin {
		if string(e) == "1" {
			num += "0"
		} else {
			num += "1"
		}
	}
	res, _ := strconv.ParseInt(num, 2, 64)
	return int(res)
}

//my first solution
func bitwiseComplement2(N int) int {
	var rem int
	sum := 0
	var bits []int
	if N == 0 {
		return 1
	}
	for N > 0 {
		rem = N % 2
		bits = append(bits, rem)
		N /= 2
	}
	l := len(bits)
	fmt.Println(bits)
	for i := l - 1; i >= 0; i-- {
		if bits[i] == 0 {
			bits[i] = 1
		} else {
			bits[i] = 0
		}
	}
	fmt.Println(bits)
	for i := l - 1; i >= 0; i-- {
		sum = bits[i] + sum*2
	}
	return sum
}
