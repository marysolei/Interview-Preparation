package main

import (
	"fmt"
)

//Question link: https://leetcode.com/problems/unique-morse-code-words/

func main() {
	words := []string{"gin", "zen", "gig", "msg"}
	fmt.Println(uniqueMorseRepresentations(words))
}

func uniqueMorseRepresentations(words []string) int {

	strarr := []string{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."}
	hmap := make(map[string]int)
	for i := 0; i < len(words); i++ {
		morse := ""
		for _, w := range words[i] {
			morse = morse + strarr[w-'a']
			//fmt.Println(w - 'a')
		}
		hmap[morse]++
	}
	return len(hmap)
}
