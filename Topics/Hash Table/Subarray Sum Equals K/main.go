package main

//Question Link: https://leetcode.com/problems/subarray-sum-equals-k/

func main() {

}

func subarraySum(nums []int, k int) int {
	sum := 0
	cnt := 0
	hmap := map[int]int{}
	for i := 0; i < len(nums); i++ {
		sum += nums[i]
		if sum == k {
			cnt++
		}
		if v, ok := hmap[sum-k]; ok {
			cnt += v
		}
		if e, ok := hmap[sum]; ok {
			hmap[sum] = e + 1
		} else {
			hmap[sum] = 1
		}
	}
	return cnt

}
