package main

import (
	"fmt"
	"sort"
	"strings"
)

//Question Link:https://leetcode.com/problems/group-anagrams/

func main() {
	in := []string{"eat", "tea", "tan", "ate", "nat", "bat"}
	fmt.Println(groupAnagrams(in))
}

func groupAnagrams(strs []string) [][]string {
	var res [][]string
	hmap := map[string]int{}
	for _, e := range strs {
		//sort e
		earr := strings.Split(e, "")
		sort.Strings(earr)
		sortede := strings.Join(earr, "")
		//if hmap[e] != 0 tmp=[]{e}
		if j, ok := hmap[sortede]; ok {
			res[j] = append(res[j], e)
		} else {
			hmap[sortede] = len(res)
			res = append(res, []string{e})
		}
	}

	return res
}
