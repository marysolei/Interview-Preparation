package main

import "fmt"

//Question Link: https://leetcode.com/problems/duplicate-zeros/

func main() {
	arr := []int{1, 0, 2, 3, 0, 4, 5, 0}
	fmt.Println(duplicateZeros(arr))
}

func duplicateZeros(arr []int) []int {

	var tmparr []int
	for _, e := range arr {
		if e == 0 {
			tmparr = append(tmparr, 0)
			tmparr = append(tmparr, 0)
		} else {
			tmparr = append(tmparr, e)
		}
	}
	for i := 0; i < len(arr); i++ {
		arr[i] = tmparr[i]
	}
	return arr

}
