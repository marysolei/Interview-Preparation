package main

import (
	"fmt"
	"strings"
)

//Question link: https://leetcode.com/problems/reverse-words-in-a-string-iii/

func main() {
	s := "Let's take LeetCode contest"
	fmt.Println(reverseWords(s))
}

//not that efficient
func reverseWords(s string) string {
	var tmp string
	var res []string
	sarr := strings.Split(s, " ")
	for i, e := range sarr {
		for _, v := range e {
			tmp = string(v) + tmp
		}
		res = append(res, tmp)
		if i != len(sarr)-1 {
			res = append(res, " ")
		}
		tmp = ""
	}
	return strings.Join(res, "")
}
