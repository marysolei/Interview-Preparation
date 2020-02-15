package main

import (
	"fmt"
)

//Question link:https://leetcode.com/problems/binary-number-with-alternating-bits/

func main() {

	fmt.Println(hasAlternatingBits(10))

}

func hasAlternatingBits(n int) bool {
	rem := n % 2
	n /= 2

	for n > 0 {
		if rem == n%2 {
			return false
		}
		rem = n % 2
		n /= 2
	}

	return true
}

//found this online

func hasAlternatingBits2(n int) bool {
	bin := fmt.Sprintf("%b", n)
	for i := 1; i < len(bin); i++ {
		if bin[i-1] == bin[i] {
			return false
		}
	}
	return true
}
