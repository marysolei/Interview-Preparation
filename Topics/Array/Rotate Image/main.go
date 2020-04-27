package main

//Question Link:https://leetcode.com/problems/rotate-image/

func main() {

}

func rotate(matrix [][]int) {

	n := len(matrix)
	for i := 0; i < n/2; i++ {
		for j := 0; j < n-n/2; j++ {
			tmp := matrix[i][j]
			matrix[i][j] = matrix[n-j-1][i]
			matrix[n-j-1][i] = matrix[n-1-i][n-1-j]
			matrix[n-i-1][n-j-1] = matrix[j][n-1-i]
			matrix[j][n-1-i] = tmp
		}
	}

}
