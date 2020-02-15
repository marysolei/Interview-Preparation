package main

import (
	"strconv"
	"strings"
	"unicode"
)

//Question Link:https://leetcode.com/problems/basic-calculator-ii/

func main() {

}

func calculate(s string) int {

	s = strings.Replace(s, " ", "", -1)
	l := len(s)
	i, res, tmp := 0, 0, 0
	sign := "+"
	for i < l {
		num := 0
		for i < l && unicode.IsDigit(rune(s[i])) {
			if n, err := strconv.Atoi(string(s[i])); err == nil {
				num = num*10 + n
				i++
			}
		}
		if sign == "+" {
			res += tmp
			tmp = num
		} else if sign == "-" {
			res += tmp
			tmp = -num
		} else if sign == "/" {
			tmp /= num
		} else if sign == "*" {
			tmp *= num
		}
		if i < l {
			sign = string(s[i])
			i++
		}

	}
	return res + tmp
}
