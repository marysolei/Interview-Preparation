package main

import (
	"fmt"
)

//Question Link:https://leetcode.com/problems/roman-to-integer/
func main() {

	fmt.Println(romanToInt("IV"))
}

var mapvalue = map[rune]int{
	'I': 1,
	'V': 5,
	'X': 10,
	'L': 50,
	'C': 100,
	'D': 500,
	'M': 1000,
}

func romanToInt(s string) int {
	var sum int
	var tmp int
	for i := 0; i < len(s); i++ {
		tmp = mapvalue[rune(s[i])]
		if i+1 < len(s) {
			if mapvalue[rune(s[i+1])] > tmp {
				sum -= tmp
				continue
			}
		}
		sum += tmp
	}
	return sum
}
