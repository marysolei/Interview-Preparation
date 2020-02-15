package main

import "fmt"

//Question Link: https://leetcode.com/problems/permutations/

func main() {
	nums := []int{1, 2, 3}
	fmt.Println(permute(nums))
}

func permute(nums []int) [][]int {
	res := make([][]int, 0)
	n := len(nums)
	current := 0
	visit := make([]bool, n)
	tmp := make([]int, n)
	helper(nums, &res, n, tmp, visit, current)
	return res
}

func helper(nums []int, res *[][]int, n int, tmp []int, visit []bool, current int) {
	if current >= n {
		tmptmp := make([]int, n)
		copy(tmptmp, tmp)
		*res = append(*res, tmptmp)
		return
	}
	for i, e := range nums {
		if visit[i] == false {
			visit[i] = true
			tmp[current] = e
			helper(nums, res, n, tmp, visit, current+1)
			visit[i] = false
		}
	}
}