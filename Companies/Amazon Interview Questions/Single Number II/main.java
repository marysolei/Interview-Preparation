//Question Link: https://leetcode.com/problems/single-number-ii/

class Solution {
    public int singleNumber(int[] nums) {

      // first appearence:
      // add num to seen_once
      // don't add to seen_twice because of presence in seen_once

      // second appearance:
      // remove num from seen_once
      // add num to seen_twice

      // third appearance:
      // don't add to seen_once because of presence in seen_twice
      // remove num from seen_twice

        int seenOnce = 0;
        int seenTwice =0;
        for (int num : nums) {
            seenOnce = ~seenTwice &(seenOnce^num);
            seenTwice = ~seenOnce & (seenTwice ^num);
        }
        return seenOnce;
    }
}

//All comments from LeetCode

/*
XOR operator can be used to detect the bit which appears odd number of times: 1, 3, 5, etc.
XOR of zero and a bit results in that bit 0⊕x=x
XOR of two equal bits (even if they are zeros) results in a zero x⊕x=0
one could see the bit in a bitmask only if it appears odd number of times.
so one could detect the bit which appears once, and the bit which appears three times. The problem is to distinguish between these two situations.

To separate number that appears once from a number that appears three times let's use two bitmasks instead of one: seen_once and seen_twice.

The idea is to:
change seen_once only if seen_twice is unchanged
change seen_twice only if seen_once is unchanged

This way bitmask seen_once will keep only the number which appears once and not the numbers which appear three times.
*/

//TimeComplexity: O(N)
//Space Complexity: O(1)




/*

HashMap Solution:

class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int num : nums){
            hmap.put(num, hmap.getOrDefault(num,0)+1);
        }
        for (int key : hmap.keySet()) {
            if (hmap.get(key)==1) return key;
        }
        return -1;
    }
}

//Time Complexity: O(N)
//Space Complexity: O(N)

*/
