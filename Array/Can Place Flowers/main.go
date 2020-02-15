package main

import (
	"fmt"
)

//Question link: https://leetcode.com/problems/can-place-flowers/

func main() {
	f := []int{0, 0, 1, 0, 1}
	fmt.Println(canPlaceFlowers(f, 1))

}

func canPlaceFlowers(flowerbed []int, n int) bool {
	l := len(flowerbed)
	cnt := 0
	for i := 0; i < l; i++ {

		if flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == l-1 || flowerbed[i+1] == 0) {
			flowerbed[i] = 1
			cnt++
		}
	}

	return cnt >= n
}