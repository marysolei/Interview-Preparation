package main

import (
	"fmt"
	"sort"
	"strings"
)

//Question Link:https://leetcode.com/problems/find-all-anagrams-in-a-string/

func main() {
	str := "cbaebabacd"
	p := "abc"
	fmt.Println(findAnagrams(str, p))
}

func findAnagrams(s string, p string) []int {
	if len(s) < len(p) {
		return []int{}
	}
	l := len(s) - len(p) + 1
	res := make([]int, 0, l)

	for i := 0; i < l; i++ {
		//fmt.Println(s[i : i+len(p)])
		//fmt.Println(isAnagram(s[i:i+len(p)], p))
		if isAnagram(s[i:i+len(p)], p) {
			res = append(res, i)

		}
	}
	return res
}

func isAnagram(str1 string, str2 string) bool {
	v1 := strings.Split(str1, "")
	v2 := strings.Split(str2, "")
	sort.Strings(v1)
	sort.Strings(v2)
	return strings.Join(v1, "") == strings.Join(v2, "")
}
