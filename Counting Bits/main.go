package main

import "fmt"

//Question link:https://leetcode.com/problems/counting-bits/

func main() {
	fmt.Println(countBits(3))
}

// 2^n -> sum: 1
func countBits(num int) []int {
	res := make([]int, num+1)
	i := 1
	for i <= num {
		for j := 0; j < i && j+i < len(res); j++ {
			res[j+i] = res[j] + 1
		}
		i *= 2
	}
	return res
}

//found this online, O(n)
func countBits2(num int) []int {
	var res []int
	base := 1
	for i := 0; i <= num; i++ {

		if i == 0 {
			res = append(res, 0)
			continue
		} else if i == 1 {
			res = append(res, 1)
			continue
		}

		if i == base*2 {
			res = append(res, 1)
			base *= 2
			continue
		}
		res = append(res, 1+res[i-base])
	}
	return res
}
