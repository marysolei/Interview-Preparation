package main

import "fmt"

//Question link:https://leetcode.com/problems/distribute-candies-to-people/

func main() {

	fmt.Println(distributeCandies(10, 3))
}

func distributeCandies(candies int, numPeople int) []int {

	res := make([]int, numPeople)
	cnt := 1
	for candies > 0 {
		for i := 0; i < numPeople; i++ {

			if candies < cnt {
				res[i] += candies
				return res
			} else {
				if candies > cnt {

					res[i] += cnt
				} else {
					res[i] += candies
				}
				candies -= cnt
				cnt++
			}

		}
	}
	return res
}
