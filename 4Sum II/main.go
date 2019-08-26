package main

//Question Link: https://leetcode.com/problems/4sum-ii/

func main() {

}

func fourSumCount(A []int, B []int, C []int, D []int) int {

	hmap := map[int]int{}
	cnt := 0
	for i := 0; i < len(A); i++ {
		for j := 0; j < len(B); j++ {
			hmap[A[i]+B[j]]++
		}
	}
	for i := 0; i < len(C); i++ {
		for j := 0; j < len(D); j++ {
			tmp := -C[i] - D[j]
			if _, ok := hmap[tmp]; ok {
				cnt += hmap[tmp]
			}
		}
	}
	return cnt

}
