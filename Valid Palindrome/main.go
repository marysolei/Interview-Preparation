package main

import (
	"fmt"
	"regexp"
	"strings"
)

//Question Link:https://leetcode.com/problems/valid-palindrome/
func main() {
	s := "A man, a plan, a canal: Panama"
	v := isPalindrome(s)
	fmt.Println(v)

}

func isPalindrome(s string) bool {

	res := modification(s)
	for i := 0; i < len(res)/2; i++ {
		if string(res[i]) != string(res[len(res)-i-1]) {
			return false
		}
	}
	return true
}
func modification(s string) string {

	reg, err := regexp.Compile("[^A-Za-z0-9]+")
	if err != nil {
		return "err"
	}
	res := reg.ReplaceAllString(s, "")
	return strings.ToLower(res)
}
