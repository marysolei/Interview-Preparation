package main

import (
	"fmt"
	"strconv"
)

//Question Link: https://leetcode.com/problems/evaluate-reverse-polish-notation/

func main() {
	arr := []string{"2", "1", "+", "3", "*"}
	fmt.Println(evalRPN(arr))
}

func evalRPN(tokens []string) int {

	res := []int{}
	for _, e := range tokens {
		n := len(res)
		switch e {

		case "+":
			res = append(res[:n-2], res[n-2]+res[n-1])
		case "*":
			res = append(res[:n-2], res[n-2]*res[n-1])
		case "/":
			res = append(res[:n-2], res[n-2]/res[n-1])
		case "-":
			res = append(res[:n-2], res[n-2]-res[n-1])
		default:
			v, _ := strconv.Atoi(e)
			res = append(res, v)
		}
	}
	return res[0]
}
