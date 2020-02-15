package main

import (
	"fmt"
)

//Question link: https://leetcode.com/problems/valid-palindrome-ii/

func main() {
	fmt.Println(validPalindrome("abc"))
}

func validPalindrome(s string) bool {
	start := 0
	end := len(s) - 1
	for start < end {
		if s[start] != s[end] {
			return checkPalindrome(s[start+1:end+1]) || checkPalindrome(s[start:end])
		}
		start++
		end--

	}
	return true

}

func checkPalindrome(s string) bool {

	for i, j := 0, len(s)-1; i < j; i, j = i+1, j-1 {
		if s[i] != s[j] {
			return false
		}

	}
	return true
}
