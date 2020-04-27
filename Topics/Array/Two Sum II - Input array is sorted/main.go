package main

import (
	"fmt"
)

//Question link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

func main() {
	arr := []int{2, 7, 11, 15}
	fmt.Println(twoSum(arr, 9))
}

func twoSum(numbers []int, target int) []int {

	i, j := 0, len(numbers)-1

	for numbers[i]+numbers[j] != target {
		if numbers[i]+numbers[j] > target {
			j--
		} else {
			i++
		}
	}
	return []int{i + 1, j + 1}
}
