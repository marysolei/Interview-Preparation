package main

import (
	"fmt"
	"strconv"
)

//Question Link: https://leetcode.com/problems/fizz-buzz/

func main() {
	fmt.Println(fizzBuzz(15))
}

func fizzBuzz(n int) []string {
	var res []string
	for i := 1; i <= n; i++ {
		if i%3 == 0 && i%5 == 0 {
			res = append(res, "FizzBuzz")
		} else if i%5 == 0 {
			res = append(res, "Buzz")
		} else if i%3 == 0 {
			res = append(res, "Fizz")
		} else {
			e := strconv.Itoa(i)
			res = append(res, e)
		}
	}
	return res
}
