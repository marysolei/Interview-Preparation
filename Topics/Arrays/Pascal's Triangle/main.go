package main

import "fmt"

//Question Link: https://leetcode.com/problems/pascals-triangle/

func main() {
	fmt.Println(generate(2))

}

func generate(numRows int) [][]int {

	res := make([][]int, numRows)

	if numRows == 0 {
		return res
	}
	res[0] = []int{1}
	tmp := res[0]
	for i := 1; i < numRows; i++ {
		arr := make([]int, i+1)
		for j := 0; j < i+1; j++ {
			if j-1 >= 0 && j < i {
				arr[j] = tmp[j] + tmp[j-1]
			} else {
				arr[j] = 1
			}
		}
		res[i] = arr
		tmp = arr
	}
	return res
}
