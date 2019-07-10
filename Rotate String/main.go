package main

import (
	"fmt"
	"strings"
)

//Question link: https://leetcode.com/problems/rotate-string/s

func main() {
	A := "abcde"
	B := "abced"
	fmt.Println(rotateString(A, B))

}
func rotateString(A string, B string) bool {

	aArr := strings.Split(A, "")
	bArr := strings.Split(B, "")
	var res []string
	if len(aArr) == 0 && len(bArr) == 0 {
		return true
	}
	if len(aArr) != len(bArr) {
		return false
	}

	for i := 0; i < len(aArr); i++ {
		res = aArr[i:]
		res = append(res, aArr[:i]...)
		if strings.Join(res, "") == strings.Join(bArr, "") {
			return true
		}
	}
	return false
}
