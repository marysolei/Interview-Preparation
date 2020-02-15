package main

import (
	"fmt"
)

//Question link: https://leetcode.com/problems/flipping-an-image/

func main() {
	in := [][]int{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}}
	fmt.Println(flipAndInvertImage(in))
}

func flipAndInvertImage(A [][]int) [][]int {
	//res := [][]int{}
	for _, row := range A {
		last := len(row) - 1
		for j := 0; j <= last/2; j++ {

			row[j], row[last-j] = row[last-j]^1, row[j]^1
		}

	}
	return A
}
