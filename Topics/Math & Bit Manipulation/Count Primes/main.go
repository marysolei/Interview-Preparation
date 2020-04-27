package main

import (
	"fmt"
)

//Question Link:https://leetcode.com/problems/count-primes/
func main() {

	fmt.Println(countPrimes(3))

}

func countPrimes(n int) int {
	recordsMap := map[int]bool{}
	cnt := 0
	if n <= 2 {
		return 0
	}
	for i := 2; i < n; i++ {

		if recordsMap[i] == false {
			cnt++
			for j := 2; j*i < n; j++ {
				recordsMap[i*j] = true
			}
		}

	}
	return cnt
}
