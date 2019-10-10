package main

//Question Link:https://leetcode.com/problems/spiral-matrix/

func main() {

}

func spiralOrder(matrix [][]int) []int {
	res := make([]int, 0)
	if len(matrix) == 0 || len(matrix[0]) == 0 {
		return res
	}
	top := 0
	left := 0
	bottom := len(matrix) - 1
	right := len(matrix[0]) - 1

	for top <= bottom && left <= right {
		//traverse right
		for i := left; i <= right; i++ {
			res = append(res, matrix[top][i])
		}
		top++
		//traverse down
		for j := top; j <= bottom; j++ {
			res = append(res, matrix[j][right])
		}
		right--
		//traverse left
		for c := right; c >= left; c-- {

			if top > bottom {
				continue
			}

			res = append(res, matrix[bottom][c])
		}
		bottom--
		//traverse up
		for r := bottom; r >= top; r-- {
			if left > right {
				continue
			}
			res = append(res, matrix[r][left])
		}
		left++
	}

	return res
}
