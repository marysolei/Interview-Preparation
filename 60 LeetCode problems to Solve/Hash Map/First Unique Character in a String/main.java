//Question Link:https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {
        if (s.length()==0)return -1;
        HashMap<Character, Integer> hmap = new HashMap<>();

        for ( char c : s.toCharArray()){
            hmap.put(c, hmap.getOrDefault(c,0)+1);
        }
        for (int i=0; i< s.length(); i++){
            if (hmap.get(s.charAt(i)) ==1){
                return i;
            }
        }
        return -1;
    }
}
