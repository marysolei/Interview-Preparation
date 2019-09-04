package main

import "fmt"

//Question Link: https://leetcode.com/problems/greatest-common-divisor-of-strings/

func main() {
	str1 := "ABCABC"
	str2 := "ABC"
	fmt.Println(gcdOfStrings(str1, str2))
}

func gcdOfStrings(str1 string, str2 string) string {
	if len(str1) == 0 || len(str2) == 0 {
		return ""
	}
	// if str1 == str2 {
	// 	return str1
	// }
	if len(str1) < len(str2) {
		return gcdOfStrings(str2, str1)
	}
	if str1[0:len(str2)] != str2 {
		return ""
	} else {
		if len(str1) == len(str2) {
			return str1
		} else {
			return gcdOfStrings(str1[len(str2):], str2)
		}
	}
}
