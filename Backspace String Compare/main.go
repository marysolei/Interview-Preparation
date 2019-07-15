package main

import (
	"fmt"
)

//Question link: https://leetcode.com/problems/backspace-string-compare/

func main() {
	S := "j##xfix"
	T := "j###xfix"
	fmt.Println(backspaceCompare(S, T))
}

func backspaceCompare(S string, T string) bool {
	return stringCompare(S) == stringCompare(T)
}

func stringCompare(s string) string {

	for i := 0; i < len(s); i++ {
		if s[i] == '#' {
			if i > 0 {
				s = s[:i-1] + s[i+1:]
				i = i - 2
			} else {
				s = s[:i] + s[i+1:]
				i--
			}
		}
	}
	return s
}
