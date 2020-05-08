package main

//Question Link: https://leetcode.com/problems/set-matrix-zeroes/

func main() {

}
func setZeroes(matrix [][]int) {
	r := len(matrix)
	c := len(matrix[0])
	for i := 0; i < r; i++ {

		for j := 0; j < c; j++ {

			if matrix[i][j] == 0 {
				for k := 0; k < c; k++ {
					if matrix[i][k] != 0 {
						matrix[i][k] = -10000
					}
				}
				for k := 0; k < r; k++ {
					if matrix[k][j] != 0 {
						matrix[k][j] = -10000
					}
				}

			}
		}
	}
	for n := 0; n < r; n++ {
		for p := 0; p < c; p++ {
			if matrix[n][p] == -10000 {
				matrix[n][p] = 0
			}
		}
	}
}
