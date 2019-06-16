package main

//Question Link: https://leetcode.com/problems/rotate-array/
func main() {
	nums := []int{1, 2, 3, 4, 5, 6, 7}
	rotate(nums, 3)

}

func rotate(nums []int, k int) {
	n := len(nums)
	k = k % len(nums)
	if k == 0 || n == 0 {
		return
	}
	temp := nums
	nums = append(nums[n-k:], nums[:n-k]...)
	for i := 0; i < len(nums); i++ {
		temp[i] = nums[i]
	}
	return
}
