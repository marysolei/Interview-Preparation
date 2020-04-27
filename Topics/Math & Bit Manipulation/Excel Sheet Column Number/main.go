package main

import (
	"fmt"
)

//Question Link:https://leetcode.com/problems/excel-sheet-column-number/
func main() {
	fmt.Println(titleToNumber("AB"))
}

func titleToNumber(s string) int {

	sum := 0
	for i := 0; i < len(s); i++ {
		sum = 26*sum + (int(s[i]) - 64)
	}
	return sum
}
