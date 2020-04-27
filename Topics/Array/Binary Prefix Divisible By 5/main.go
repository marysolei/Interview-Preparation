package main

import "fmt"

//Question link: https://leetcode.com/problems/binary-prefix-divisible-by-5/

func main() {
	a := []int{0, 1, 1}
	fmt.Println(prefixesDivBy5(a))
}

func prefixesDivBy5(A []int) []bool {
	resarr := make([]bool, len(A))
	res := 0
	for i, e := range A {
		res = (res*2 + e) % 5 //in order to prevent overflow you need to do the %5 here
		if res == 0 {
			resarr[i] = true
		} else {
			resarr[i] = false
		}
	}
	return resarr
}
