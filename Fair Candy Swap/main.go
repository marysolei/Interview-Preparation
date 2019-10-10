package main

import "fmt"

//Question link: https://leetcode.com/problems/fair-candy-swap/

func main() {
	a := []int{1, 1}
	b := []int{2, 2}
	fmt.Println(fairCandySwap(a, b))

}

func fairCandySwap(A []int, B []int) []int {

	sumA := summation(A)
	sumB := summation(B)
	diff := (sumB - sumA) / 2
	hmap := map[int]int{}

	for i, v := range B {
		hmap[v] = i
	}
	for _, e := range A {
		if _, ok := hmap[e+diff]; ok {
			return []int{e, e + diff}
		}
	}

	return []int{}

}

func summation(A []int) int {
	sum := 0
	for _, e := range A {
		sum += e
	}
	return sum
}
