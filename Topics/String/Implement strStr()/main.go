package main

import (
	"fmt"
)

//Question Link:https://leetcode.com/problems/implement-strstr/
func main() {
	haystack := "hello"
	needle := "ll"
	fmt.Println(strStr(haystack, needle))
}

func strStr(haystack string, needle string) int {

	index := -1
	haylen := len(haystack)
	needleLen := len(needle)
	if haylen == 0 && needleLen == 0 {
		return 0
	}
	if needleLen == 0 {
		return 0
	}
	for i := 0; i <= haylen-needleLen; i++ {
		if haystack[i:i+needleLen] == needle {
			index = i
			break
		}
	}

	return index

}
