//Question Link: https://leetcode.com/problems/jewels-and-stones/

class Solution {
    public int numJewelsInStones(String J, String S) {

        if (S.length() == 0 || J.length() == 0)return 0;
        int cnt =0;
        HashSet<Character> jewels = new HashSet<>();

        for (char jewel : J.toCharArray()) {
            jewels.add(jewel);
        }
        for (char stone : S.toCharArray()) {
            if (jewels.contains(stone)) {
                cnt++;
            }
        }
        return cnt;
    }
}
//Time Complexity: O(s+j)
//Space Complexity: O(j) 
