//Question URL: https://leetcode.com/problems/remove-vowels-from-a-string/

class Solution {
    public String removeVowels(String S) {
        if (S == null || S.length() == 0 )return S;
        Set<Character> hset = new HashSet<>();
        hset.add('a');
        hset.add('e');
        hset.add('i');
        hset.add('o');
        hset.add('u');

        StringBuilder res = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (!hset.contains(c)) {
                res.append(c);
            }
        }
        return new String(res);
    }
}

//Time Complexity: O(N)
//Space Complexity: O(N)
