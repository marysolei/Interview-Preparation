package main

import "fmt"

//Question link: https://leetcode.com/problems/buddy-strings/

func main() {
	a := "aaaaaaabc"
	b := "aaaaaaacb"
	fmt.Println(buddyStrings(a, b))
}

func buddyStrings(A string, B string) bool {
	cnt := 0
	tmp1 := []byte{}
	tmp2 := []byte{}
	if len(A) != len(B) {
		return false
	}
	if A == B {
		for i := range A {
			if i > 0 && A[i] == A[0] {
				return true
			}
		}
		return false
	}
	for i := 0; i < len(A); i++ {
		if A[i] != B[i] {
			cnt++
			tmp1 = append(tmp1, A[i])
			tmp2 = append(tmp2, B[i])
		}
	}

	if cnt == 2 && len(tmp1) == len(tmp2) {
		for i, j := 0, len(tmp2)-1; i < len(tmp1); i, j = i+1, j-1 {
			if tmp1[i] != tmp2[j] {
				return false
			}
		}
		return true
	}
	return false
}
