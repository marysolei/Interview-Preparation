package main

import (
	"fmt"
	"math"
	"strconv"
	"strings"
)

//Question link: https://leetcode.com/problems/compare-version-numbers/

func main() {
	v1 := "1.0"
	v2 := "1"
	fmt.Println(compareVersion(v1, v2))
}

func compareVersion(version1 string, version2 string) int {
	v1 := stringToInts(version1)
	v2 := stringToInts(version2)
	l := int(math.Max(float64(len(v1)), float64(len(v2))))
	for i := 0; i < l; i++ {

		if i < len(v1) && i < len(v2) {
			if v1[i] > v2[i] {
				return 1
			} else if v1[i] < v2[i] {
				return -1
			}

		} else if i >= len(v1) {
			if v2[i] != 0 {
				return -1
			}
		} else {
			if v1[i] != 0 {
				return 1
			}
		}
	}
	return 0
}
func stringToInts(s string) []int {
	var res []int
	v := strings.Split(s, ".")
	for i := 0; i < len(v); i++ {
		n, _ := strconv.Atoi(v[i])
		res = append(res, n)
	}
	return res
}
