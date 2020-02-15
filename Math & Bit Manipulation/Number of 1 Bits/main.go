package main

import (
	"fmt"
)

//Question Link: https://leetcode.com/problems/number-of-1-bits/
func main() {
	i := uint32(00000000000000000000000000001011)
	fmt.Println(hammingWeight(i))

}

func hammingWeight(num uint32) int {
	var cnt int
	v := uint32(1)
	for i := 0; i < 32; i++ {

		if v&num != 0 {
			cnt++
		}
		//right shift so we can check other bits
		num = num >> 1
	}
	return cnt
}
