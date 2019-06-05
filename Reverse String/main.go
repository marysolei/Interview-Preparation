package main

import "fmt"

// Write a function that reverses a string. The input string is given as an array of characters char[].
// Do not allocate extra space for another array, you must do this by modifying the input array in-place
//with O(1) extra memory.
//Question Link: https://leetcode.com/problems/reverse-string/
func main() {
	a := []byte{'a', 'b', 'c'}
	fmt.Println(reverseString(a))
}

func reverseString(s []byte) []byte {
	for i, j := 0, len(s)-1; i < j; i, j = i+1, j-1 {
		s[i], s[j] = s[j], s[i]
	}
	return s
}
