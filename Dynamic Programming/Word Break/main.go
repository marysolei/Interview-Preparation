package main

import (
	"fmt"
)

//Question Link:https://leetcode.com/problems/word-break/

func main() {
	s := "applepenapple"
	worddict := []string{"apple", "pen"}
	fmt.Println(wordBreak(s, worddict))
}

func wordBreak(s string, wordDict []string) bool {

	res := make([]bool, len(s)+1)
	res[0] = true

	for i := range s {
		if res[i] {
			for _, word := range wordDict {
				if i+len(word) <= len(s) && s[i:i+len(word)] == word {
					res[i+len(word)] = true
				}
			}
		}
	}
	return res[len(s)]
}
