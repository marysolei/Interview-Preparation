package main

import "sort"

//Question link: https://leetcode.com/problems/two-city-scheduling/

func main() {

}

func twoCitySchedCost(costs [][]int) int {
	sum := 0

	sort.Slice(costs, func(i, j int) bool {
		return costs[i][0]-costs[i][1] < costs[j][0]-costs[j][1]
	})
	for i := range costs {
		if i < len(costs)/2 {
			sum += costs[i][0]
		} else {
			sum += costs[i][1]
		}
	}

	return sum
}
