//Question Link: https://leetcode.com/problems/most-common-word/

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        if (paragraph.length() == 0 )return paragraph;
        int maxValue =Integer.MIN_VALUE ;
        String result = "";
        Set<String> bannedSet = new HashSet<>();
        for (String banWord : banned) {
            bannedSet.add(banWord);
        }
        HashMap <String, Integer> freq = new HashMap<>();
        paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z]", " ");
        for (String word : paragraph.split(" ")) {
            if (!bannedSet.contains(word)) {
                freq.put(word, freq.getOrDefault(word, 0) +1);
            }
        }
        for (String word : freq.keySet()) {
            if (result.equals("") || maxValue < freq.get(word)) {
                maxValue = freq.get(word);
                result = word;
            }
        }
        return result;
    }
}

//Time Complexity: O(P+B) -> P is the length of paragraph and B size of banned words
//SpaceComplexity: O(P+B)
