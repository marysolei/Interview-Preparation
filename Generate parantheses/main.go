package main

import "fmt"

//Question Link:https://leetcode.com/problems/generate-parentheses/

func main() {
	fmt.Println(generateParenthesis(3))
}

func generateParenthesis(n int) []string {
	left, right := n, n
	str := []string{}
	generate(&str, "", left, right)
	return str

}
func generate(str *[]string, s string, left int, right int) {

	if left > right {
		return
	}
	if left == 0 && right == 0 {
		*str = append(*str, s)
		return
	}
	if left > 0 {
		generate(str, s+"(", left-1, right)
	}
	if right > 0 {
		generate(str, s+")", left, right-1)
	}
}
