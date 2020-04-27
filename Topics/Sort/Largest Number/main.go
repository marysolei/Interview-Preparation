package main

import (
	"fmt"
	"sort"
	"strconv"
	"strings"
)

//Question Link:https://leetcode.com/problems/largest-number/

func main() {
	nums := []int{3, 30, 34, 5, 9}
	fmt.Println(largestNumber(nums))
}

func largestNumber(nums []int) string {

	res := make([]string, len(nums))
	for i, e := range nums {
		res[i] = strconv.Itoa(e)
	}
	sort.Slice(res, func(i, j int) bool {
		return (res[i] + res[j]) > (res[j] + res[i])
	})
	numRes := strings.Join(res, "")
	numRes = strings.TrimLeft(numRes, "0")
	if numRes == "" {
		return "0"
	}
	return numRes
}
