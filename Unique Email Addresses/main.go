package main

import (
	"fmt"
	"strings"
)

//Question Link: https://leetcode.com/problems/unique-email-addresses/

func main() {
	emails := []string{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"}
	fmt.Println(numUniqueEmails(emails))
}

func numUniqueEmails(emails []string) int {

	hmap := map[string]bool{}
	for _, e := range emails {
		emailSection := strings.Split(e, "@")
		localSection := strings.Split(emailSection[0], "+")
		mainlocal := strings.ReplaceAll(localSection[0], ".", "")
		finalStr := mainlocal + "@" + emailSection[1]
		if _, ok := hmap[finalStr]; !ok {
			hmap[finalStr] = true

		}
	}
	return len(hmap)
}
