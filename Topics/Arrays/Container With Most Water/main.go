package main

//Question Link: https://leetcode.com/problems/container-with-most-water/

func main() {

}

//O(n)
func maxArea(height []int) int {

	max := 0
	l := 0
	r := len(height) - 1
	for l < r {
		current := (r - l) * min(height[r], height[l])
		if current > max {
			max = current
		}
		if height[l] < height[r] {
			l++
		} else {
			r--
		}
	}
	return max
}

//O(n^2)
func maxArea2(height []int) int {
	max := 0

	for i := 0; i < len(height)-1; i++ {
		for j := 1; j < len(height); j++ {
			tmp := (j - i) * min(height[i], height[j])
			if tmp > max {
				max = tmp
			}
		}
	}
	return max
}

func min(a int, b int) int {
	if a <= b {
		return a
	}
	return b
}
