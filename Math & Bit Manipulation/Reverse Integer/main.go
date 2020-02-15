package main

import (
	"fmt"
	"math"
)

func main() {

	str := -123
	fmt.Println(reverse(str))
}

func reverse(x int) int {

	n := x
	sum := 0
	remain := 0
	cnt := count(x)
	if x > math.MaxInt32 || x < math.MinInt32 {
		return 0
	}
	if x < 0 {
		n = 0 - x
	}
	for n != 0 {
		remain = n % 10
		n = n / 10
		cnt--
		sum += remain * int(math.Pow(float64(10), float64(cnt)))
	}

	if sum > math.MaxInt32 || sum < math.MinInt32 {
		return 0
	}
	if x < 0 {
		return 0 - sum
	}
	return sum

}
func count(n int) int {
	cnt := 0
	for n != 0 {
		n = n / 10
		cnt++
	}
	return cnt
}
