package main

//Question Link: https://leetcode.com/problems/sort-colors/

func main() {

	//arr := []int{2, 0, 2, 1, 1, 0}
	//fmt.Println(sortColors(arr))
}

func sortColors(nums []int) {

	left := 0
	right := len(nums) - 1

	i := 0
	for i < right {
		if nums[i] == 2 {
			nums[i], nums[right] = nums[right], nums[i]
			right--
			continue
		}
		i++
	}
	i = right
	for i > left {
		if nums[i] == 0 {
			nums[i], nums[left] = nums[left], nums[i]
			left++
			continue
		}
		i--
	}
}

func sortColors2(nums []int) {
	zeros, ones, tows := 0, 0, 0
	for _, e := range nums {
		if e == 0 {
			zeros++
		} else if e == 1 {
			ones++
		} else if e == 2 {
			tows++
		}
	}
	for i := 0; i < zeros; i++ {
		nums[i] = 0
	}
	for j := zeros; j < zeros+ones; j++ {
		nums[j] = 1
	}
	for k := zeros + ones; k < len(nums); k++ {
		nums[k] = 2
	}
	//return nums
}
