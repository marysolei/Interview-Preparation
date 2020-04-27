package main

import (
	"fmt"
	"strings"
)

//Question link: https://leetcode.com/problems/word-pattern/

func main() {
	pattern := "aaaa"
	str := "dog cat cat dog"
	fmt.Println(wordPattern(pattern, str))
}

func wordPattern(pattern string, str string) bool {
	strArr := strings.Split(str, " ")
	//fmt.Println(len(strArr))
	if len(strArr) != len(pattern) {
		return false
	}
	pMap := map[byte]int{}
	sMap := map[string]int{}
	for _, e := range pattern {
		pMap[byte(e)]++
	}
	for _, v := range strArr {
		sMap[string(v)]++
	}
	//fmt.Println(pMap)
	//fmt.Println(sMap)
	for i := 0; i < len(pattern); i++ {
		tmp := pattern[i]
		if v, ok := pMap[tmp]; ok {
			if v != sMap[strArr[i]] {
				return false
			}
		}
	}
	return true

}
