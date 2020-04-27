package main

import (
	"fmt"
	"math"
	"sort"
)

//Question link: https://leetcode.com/problems/squares-of-a-sorted-array/

func main() {
	in := []int{-4, -1, 0, 3, 10}
	fmt.Println(sortedSquares(in))
}

func sortedSquares(A []int) []int {
	res := []int{}
	for _, e := range A {
		res = append(res, int(math.Pow(float64(e), 2)))
	}
	sort.Ints(res)
	return res
}
