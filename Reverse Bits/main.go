package main

import "fmt"

//Question Link: https://leetcode.com/problems/reverse-bits/

func main() {
	fmt.Println(reverseBits(4))
}

func reverseBits(num uint32) uint32 {
	var res uint32
	for i := 0; i < 32; i++ {
		//num&1 => get the lowest bit of num
		//append that bit to the right of res
		res = res<<1 | num&1
		//right shift
		num >>= 1
	}
	return res
}
