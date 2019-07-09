package main

import (
	"fmt"
)

//Question link: https://leetcode.com/problems/palindrome-number/

func main() {

	fmt.Println(isPalindrome(121))
}

func isPalindrome(x int) bool {
	rev := 0
	org := x
	for x > 0 {
		rev = rev*10 + x%10

		x /= 10
	}
	if rev != org {
		return false
	}
	return true
}
