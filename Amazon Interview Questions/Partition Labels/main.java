//Question URL: https://leetcode.com/problems/partition-labels/

class Solution {
    public List<Integer> partitionLabels(String S) {

        List<Integer> result = new ArrayList<>();
        if (S== null || S.length() == 0)return result;
        HashMap<Character, Integer> indexes = new HashMap<>();
        for (int i=0; i< S.length() ; i++) {
            indexes.put(S.charAt(i), i);
        }
        int start =0;
        int maxIndex = -1;
        for (int i=0; i< S.length(); i++) {

            int mapIndex = indexes.get(S.charAt(i));
            maxIndex = Math.max(maxIndex, mapIndex);
            if (i == maxIndex) {
                result.add(i-start+1);
                start = maxIndex+1;
            }
        }
        return result;
    }
}
