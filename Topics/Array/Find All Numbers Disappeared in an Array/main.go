package main

//Question link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

func main() {

}

func findDisappearedNumbers(nums []int) []int {

	var res []int

	for i := range nums {
		tmp := nums[i]
		if tmp < 0 {
			tmp *= -1
		}
		if nums[tmp-1] > 0 {
			nums[tmp-1] *= -1
		}

	}
	for j := range nums {
		if nums[j] > 0 {
			res = append(res, j+1)
		}
	}
	return res
}
