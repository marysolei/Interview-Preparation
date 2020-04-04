//Question Link: https://leetcode.com/problems/reorganize-string/

class Solution {
    public String reorganizeString(String S) {

        if (S== null || S.length() ==0)return S;
        HashMap<Character, Integer> counts = new HashMap<>();
        for (char c : S.toCharArray()) {
            counts.put(c, counts.getOrDefault(c,0)+1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b) -> counts.get(b) - counts.get(a));
        maxHeap.addAll(counts.keySet());

        StringBuilder res = new StringBuilder();
        while (maxHeap.size()>1) {
            char current = maxHeap.poll();
            char next = maxHeap.poll();
            res.append(current);
            res.append(next);
            counts.put(current, counts.get(current)-1);
            counts.put(next, counts.get(next)-1);
            if (counts.get(current)>0 ){
                maxHeap.add(current);
            }
            if (counts.get(next)>0 ){
                maxHeap.add(next);
            }
        }
        if (!maxHeap.isEmpty()) {
             char c = maxHeap.poll();
            if (counts.get(c)>1) return "";

            res.append(c);
        }
        return res.toString();
    }
}


//Time Complexity: O(NlogA)), where N is the length of S, and A is the size of the alphabet. If A is fixed O(N).
//Space Complexity: O(A). If A is fixed, this complexity is O(1).
