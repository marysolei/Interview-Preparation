package main

import "fmt"

//Question link: https://leetcode.com/problems/di-string-match/

func main() {
	in := "IDID"
	fmt.Println(diStringMatch(in))
}
func diStringMatch(S string) []int {
	n := len(S)
	res := make([]int, n+1)
	lo := 0
	hi := n
	for i := 0; i < len(S); i++ {
		if S[i] == 'D' {
			res[i] = hi
			hi--
		} else if S[i] == 'I' {
			res[i] = lo
			lo++

		}
		res[n] = lo
	}
	return res

}
