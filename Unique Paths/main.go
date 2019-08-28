package main

//Question Link: https://leetcode.com/problems/unique-paths/

func main() {

}

func uniquePaths(m int, n int) int {

	res := 1
	for i := n; i < m+n-1; i++ {
		res *= i
		res /= (i - n + 1)
	}
	return res

}

//
func uniquePaths2(m int, n int) int {
	if m == 1 || n == 1 {
		return 1
	}
	return uniquePaths(m-1, n) + uniquePaths(m, n-1)
}
