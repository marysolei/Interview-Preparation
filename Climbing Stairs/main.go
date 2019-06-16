package main

import (
	"fmt"
)

//Question Link:https://leetcode.com/problems/climbing-stairs/
// leetcode solution: https://leetcode.com/problems/climbing-stairs/solution/

func main() {

	fmt.Println(climbStairs(3))

}

func climbStairs(n int) int {

	if n <= 1 {
		return 1
	}
	first := 1
	second := 2

	for i := 3; i <= n; i++ {
		third := first + second
		first = second
		second = third
	}
	return second
}
