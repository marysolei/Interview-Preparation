package main

import (
	"fmt"
)

//Question link: https://leetcode.com/problems/letter-case-permutation/

func main() {
	fmt.Println(letterCasePermutation("1b2c"))
}

func letterCasePermutation(S string) []string {

	if len(S) == 0 {
		return []string{""}
	}
	var res []string
	char := S[len(S)-1]
	for _, v := range letterCasePermutation(S[:len(S)-1]) {
		res = append(res, v+string(char))
		if char >= 'a' && char <= 'z' {
			res = append(res, v+string(char-32))
		} else if char >= 'A' && char <= 'Z' {
			res = append(res, v+string(char+32))
		}
	}
	return res

}
