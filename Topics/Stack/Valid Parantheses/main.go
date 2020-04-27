package main

import (
	"fmt"
)

//Question Link: https://leetcode.com/problems/valid-parentheses/

type stack []byte

func main() {
	arr := "]"
	fmt.Println(isValid(arr))

}

func isValid(s string) bool {

	stack := make([]rune, len(s))
	hmap := map[rune]rune{
		'[': ']',
		'{': '}',
		'(': ')',
	}
	top := 0
	for _, e := range s {
		if e == '{' || e == '[' || e == '(' {
			stack[top] = hmap[e]
			top++
		} else if e == '}' || e == ']' || e == ')' {
			if top > 0 && stack[top-1] == e {
				top--
			} else {
				return false
			}
		}
	}
	return top == 0
}
