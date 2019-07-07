package main

import (
	"fmt"
	"strings"
)

//Question link: https://leetcode.com/problems/occurrences-after-bigram/s

func main() {
	str := "alice is a good girl she is a good student"
	fmt.Println(findOcurrences(str, "a", "good"))
}

func findOcurrences(text string, first string, second string) []string {
	var res []string
	arrString := strings.Split(text, " ")
	if len(arrString) < 3 {
		return []string{}
	}
	for i, j := 0, 1; j < len(arrString); i, j = i+1, j+1 {

		if arrString[i] == first && arrString[j] == second && j+1 < len(arrString) {
			res = append(res, arrString[j+1])
		}
	}
	return res
}
