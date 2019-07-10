package main

import (
	"fmt"
	"strings"
)

//Question link: https://leetcode.com/problems/uncommon-words-from-two-sentences/

func main() {
	A := "this apple is sweet"
	B := "this apple is sour"
	fmt.Println(uncommonFromSentences(A, B))

}

func uncommonFromSentences(A string, B string) []string {
	hMap := map[string]int{}
	var res []string
	aArr := strings.Split(A, " ")
	bArr := strings.Split(B, " ")

	for _, word := range aArr {
		hMap[word]++
	}
	for _, word := range bArr {
		hMap[word]++
	}
	for w, cnt := range hMap {
		if cnt == 1 {
			res = append(res, w)
		}
	}
	return res
}
