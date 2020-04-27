package main

import "fmt"

//Question Link:https://leetcode.com/problems/fibonacci-number/

func main() {

	fmt.Println(fib(3))
}
func fib(N int) int {
	res := 0
	base := 0
	next := 1
	if N < 2 {
		return N
	}
	for i := 2; i <= N; i++ {
		res = base + next
		base = next
		next = res
	}
	return res
}
