package main

import (
	"fmt"
	"reflect"
	"sort"
	"strings"
)

//Question Link: https://leetcode.com/problems/valid-anagram/

func main() {
	s1 := "anagrabm"
	s2 := "nagaraam"
	fmt.Println(isAnagram(s1, s2))
	fmt.Println(isAnagram2(s1, s2))
}

func isAnagram(s string, t string) bool {

	if len(s) != len(t) {
		return false
	}
	s1 := sortString(s)
	s2 := sortString(t)
	if strings.Compare(s1, s2) != 0 {
		return false
	}
	return true
}
func sortString(s string) string {
	str := strings.Split(s, "")
	sort.Strings(str)
	return strings.Join(str, "")
}

//faster approach
func isAnagram2(s string, t string) bool {
	m1 := map[rune]int{}
	m2 := map[rune]int{}
	for _, e := range s {
		m1[e]++
	}
	for _, v := range t {
		m2[v]++
	}
	return reflect.DeepEqual(m1, m2)
}
