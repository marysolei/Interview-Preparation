//Question Link: https://leetcode.com/problems/sort-characters-by-frequency/

class Solution {
    public String frequencySort(String s) {

        //Get the count of each character
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c,0)+1);
        }

        //Sort the chars based on their freq
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b) -> freq.get(b) - freq.get(a));
        maxHeap.addAll(freq.keySet());

        //make the result string
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {

            char current = maxHeap.poll();
            for (int i=0; i< freq.get(current); i++) {
                result.append(current);
            }
        }
        return result.toString();
    }
}

//Time Complexity: O(NlogN) -> N number of chars OR O(N+ klogk) where k is the number of unique chars
//Space Complexity: O(k) -> hmap of k chars but the string builder is of size of N
