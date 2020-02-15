package main

import (
	"fmt"
	"strings"
)

//Question Link: https://leetcode.com/problems/to-lower-case/

func main() {
	str := "HELLO"
	fmt.Println(toLowerCase(str))

}

func toLowerCase(str string) string {

	res := ""
	for _, e := range str {
		if e >= 65 && e <= 95 {
			e += 32
			res = res + string(e)
		} else {
			res += string(e)
		}
	}
	return res
}
func toLowerCase2(str string) string {
	return strings.ToLower(str)
}
