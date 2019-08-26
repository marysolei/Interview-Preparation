package main

import (
	"fmt"
	"strconv"
)

//Question link: https://leetcode.com/problems/base-7/

func main() {
	n := 100
	fmt.Println(convertToBase7(n))
}
func convertToBase7(num int) string {
	var res string
	if num == 0 {
		return "0"
	}
	org := num
	if num < 0 {
		num = (-1) * num
	}
	for num > 0 {
		tmp := num % 7
		res = strconv.Itoa(tmp) + res
		num /= 7
	}
	if org < 0 {
		res = "-" + res
	}
	return res
}
