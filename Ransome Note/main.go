package main

import (
	"fmt"
)

//Question link:https://leetcode.com/problems/ransom-note/

func main() {
	word := "aa"
	mag := "aab"
	fmt.Println(canConstruct(word, mag))
}

func canConstruct(ransomNote string, magazine string) bool {
	magmap := map[rune]int{}
	for _, e := range magazine {
		magmap[e]++
	}
	for _, v := range ransomNote {
		if _, ok := magmap[v]; !ok || magmap[v] == 0 {
			return false
		}
		magmap[v]--
	}
	return true
}
