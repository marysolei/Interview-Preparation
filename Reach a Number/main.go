package main

import "fmt"

//Question link: https://leetcode.com/problems/reach-a-number/

func main() {
	target := 3
	fmt.Println(reachNumber(target))
}

func reachNumber(target int) int {
	if target < 0 {
		target = -target
	}
	cnt := 0
	sum := 0
	for sum < target {
		cnt++
		sum += cnt
	}
	for (sum-target)%2 != 0 {
		cnt++
		sum += cnt
	}
	return cnt
}
