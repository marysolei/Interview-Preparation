package main

import (
	"fmt"
	"strings"
)

//Question link: https://leetcode.com/problems/repeated-string-match/

func main() {
	a := "abcd"
	b := "cdabcdab"
	fmt.Println(repeatedStringMatch(a, b))

}

func repeatedStringMatch(A string, B string) int {

	if len(A) == 0 && len(B) == 0 {
		return 1
	} else if len(A) == 0 || len(B) == 0 {
		return 0
	}
	tmp := A
	limit := len(B)/len(A) + 2
	i := 0

	for i < limit {
		if strings.Index(tmp, B) > -1 {
			return i + 1
		}
		tmp += A
		i++
	}

	return -1
}