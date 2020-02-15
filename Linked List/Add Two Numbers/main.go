package main

import (
	"math"
	"strings"
)

// Input: "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the ln of 3.
func main() {

}

//O(n^3)
// func lengthOfLongestSubstring(s string) int {
// 	ln := 0
// 	flag := 0
// 	if len(s) > 0 {
// 		ln = 1
// 	}
// 	for i := 0; i < len(s); i++ {
// 		for j := i; j <= len(s); j++ {
// 			for k := i; k < j; k++ {
// 				if s[j] == s[k] {
// 					flag = 1
// 					break
// 				}
// 			}
// 			if flag > 0 {
// 				break
// 			}
// 			if j-i+1 > len(s) {
// 				ln = j - i + 1
// 			}
// 		}
// 	}
// 	return ln
// }

func lengthoflongest(s string) int {
	i, j := 0, 0
	ans := 0
	substr := s[i : j-1]
	for i < len(s) && j < len(s) {
		if !strings.Contains(s, string(s[j])) {
			substr = substr[:j]
			ans = math.Max(ans, j-i)
		}
	}
	// substr := s[i:j-1]
	//         if !strings.Contains(substr, s[j-1:j]) {
	//             if max < j-i {
	//                 max = j - i
	//             }
	//         } else {
	//             break
	//         }
	//     }
	// }

}
