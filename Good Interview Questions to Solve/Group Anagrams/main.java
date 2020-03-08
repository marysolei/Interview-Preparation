//Question Link: https://leetcode.com/problems/group-anagrams/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        if (strs.length == 0 )return result;
        HashMap<String, List<String>> hmap = new HashMap<>();

        for (String word : strs) {

            char[] charArr = word.toCharArray();
            Arrays.sort(charArr);
            String key = String.valueOf(charArr);
            if (!hmap.containsKey(key)) {
                hmap.put(key, new ArrayList<>());
            }
            hmap.get(key).add(word);
        }

        return new ArrayList<>(hmap.values());
    }
}

//Time Complexity: O(N*KlogK) N length of strs and K is the max lenght of a string in strs.
//Space Complexity: O(NK)
