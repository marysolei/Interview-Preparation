package main

import (
	"fmt"
	"strings"
)

//Question link: https://leetcode.com/problems/find-the-difference/

func main() {
	s := "abcd"
	t := "abcde"
	fmt.Println(findTheDifference(s, t))
}

func findTheDifference(s string, t string) byte {

	for _, e := range s {
		t = strings.Replace(t, string(e), "", 1)
	}
	return t[0]
}

//more efficient in timing
func findTheDifference2(s string, t string) byte {
	hmap := map[rune]int{}
	if len(s) == len(t) {
		return ' '
	}
	for _, e := range s {
		hmap[e]++
	}
	for _, v := range t {
		hmap[v]--
		if hmap[v] < 0 {
			return byte(v)
		}
	}
	return ' '
}
