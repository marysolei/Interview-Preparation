package main

import "fmt"

//Question Link: https://leetcode.com/problems/subsets/

func main() {
	nums := []int{1, 2, 3}
	fmt.Println(subsets(nums))
}

func subsets(nums []int) [][]int {
	res := [][]int{}
	tmp := []int{}
	helper(nums, &res, tmp, 0)
	return res
}
func helper(nums []int, res *[][]int, tmp []int, level int) {

	tmptmp := make([]int, len(tmp))
	copy(tmptmp, tmp)
	*res = append(*res, tmptmp)

	for i := level; i < len(nums); i++ {
		tmp = append(tmp, nums[i])
		helper(nums, res, tmp, i+1)
		tmp = tmp[:len(tmp)-1]
	}
}
