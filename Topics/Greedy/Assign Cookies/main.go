package main

import "sort"

//Question link: https://leetcode.com/problems/assign-cookies/
func main() {

}

func findContentChildren(g []int, s []int) int {
	sort.Ints(g)
	sort.Ints(s)
	i, j := 0, 0
	cnt := 0
	for i < len(g) && j < len(s) {
		if g[i] <= s[j] {
			cnt++
			i++
			j++
			continue
		}
		j++
	}
	return cnt
}
