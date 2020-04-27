package main

import (
	"fmt"
)

//Question link: https://leetcode.com/problems/add-digits/

func main() {

	fmt.Println(addDigits(38))
}

func addDigits(num int) int {

	if num < 10 {
		return num
	}
	for num >= 10 {
		sum := 0
		for num > 0 {
			sum += num % 10
			num /= 10
		}
		num = sum
	}
	return num

}
