package main

import "fmt"

//Question Link: https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/

func main() {
	words := []string{"cat", "bt", "hat", "tree"}
	chars := "atach"
	fmt.Println(countCharacters(words, chars))
}

func countCharacters(words []string, chars string) int {
	//cnt := 0
	res := 0
	hmap := map[rune]int{}
	for _, e := range chars {
		hmap[e]++
	}
	for _, word := range words {
		tmp := map[rune]int{}
		for i, ch := range hmap {
			tmp[i] = ch
		}
		for ind, val := range word {
			if _, ok := tmp[val]; !ok {
				break
			}
			if _, ok := tmp[val]; ok {
				tmp[val]--
			}
			if tmp[val] < 0 {
				break
			}
			if ind == len(word)-1 {
				res += len(word)
			}
		}
	}
	return res

}
