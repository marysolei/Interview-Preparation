package main

import "fmt"

//Question Link: https://leetcode.com/problems/jewels-and-stones/

func main() {
	J := "aA"
	S := "aAAbbbb"
	fmt.Println(numJewelsInStones(J, S))
}

func numJewelsInStones(J string, S string) int {
	hmap := make(map[rune]bool)
	cnt := 0
	for _, e := range J {
		hmap[e] = true
	}
	for _, v := range S {
		if _, ok := (hmap[v]); ok {
			cnt++
		}
	}
	return cnt
}
