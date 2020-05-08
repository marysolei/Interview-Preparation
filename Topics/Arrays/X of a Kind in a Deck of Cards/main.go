package main

import "fmt"

//Question link: https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/

func main() {
	a := []int{1, 1, 1, 2, 2, 2, 3, 3}
	fmt.Println(hasGroupsSizeX(a))
}

func hasGroupsSizeX(deck []int) bool {
	gcd := 0
	hmap := map[int]int{}
	for i := 0; i < len(deck); i++ {
		hmap[deck[i]]++
	}
	//fmt.Println(hmap)
	for _, v := range hmap {
		gcd = gcdfunc(gcd, v)
	}
	return gcd > 1
}
func gcdfunc(a int, b int) int {
	for b != 0 {
		a, b = b, a%b
	}
	return a
}
