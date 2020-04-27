package main

import (
	"fmt"
)

//Question Link:https://leetcode.com/problems/first-unique-character-in-a-string/
func main() {
	s := "leetcode"
	fmt.Println(firstUniqChar(s))
}

func firstUniqChar(s string) int {

	hmap := map[string]int{}
	if len(s) == 0 {
		return -1
	}
	for _, e := range s {
		hmap[string(e)]++
	}
	for i := 0; i < len(s); i++ {
		if hmap[string(s[i])] == 1 {
			return i
		}

	}
	return -1
}
