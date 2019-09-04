package main

//Question link: https://leetcode.com/problems/find-the-town-judge/
func main() {

}

func findJudge(N int, trust [][]int) int {
	cnt := make([]int, N+1)
	trusted := make([]bool, N+1)
	for _, v := range trust {
		cnt[v[1]]++
		trusted[v[0]] = true
	}
	for i := 1; i <= N; i++ {
		if cnt[i] == N-1 && !trusted[i] {
			return i
		}
	}
	return -1
}
