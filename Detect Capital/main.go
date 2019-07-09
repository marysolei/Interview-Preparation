package main

import (
	"fmt"
	"strings"
)

//Question link: https://leetcode.com/problems/detect-capital/

func main() {
	word := "gggF"
	fmt.Println(detectCapitalUse(word))
}
func detectCapitalUse(word string) bool {
	ind := -1
	cnt := 0
	if len(word) == 1 {
		return true
	}
	for i, e := range word {
		v := int(e)
		if v >= 65 && v <= 90 {
			cnt++
			ind = i
		}
	}
	if cnt == len(word) || cnt == 0 {
		return true
	} else if cnt < len(word) && cnt != 1 {
		return false
	} else if cnt == 1 {
		return ind == 0
	}
	return true
}

//saw this online which is way easier
func detectCapitalUse2(word string) bool {
	up := strings.ToUpper(word)
	low := strings.ToLower(word)
	return up == word || low[1:] == word[1:]
}
