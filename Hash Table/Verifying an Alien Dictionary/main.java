//Question Link: https://leetcode.com/problems/verifying-an-alien-dictionary/

class Solution {
    public boolean isAlienSorted(String[] words, String order) {

        if (words == null || words.length == 0 || order.length() == 0 )return false;
        int[] dict = new int[26] ;
        for (int i =0; i< order.length() ; i++) {
            char c = order.charAt(i) ;
            dict[c-'a'] = i;
        }

        for (int i=0; i< words.length -1; i++) {

            String word1 = words[i] ;
            String word2 = words[i+1];
            int minlen = Math.min(word1.length() , word2.length()) ;
            for (int k =0; k< minlen; k++) {
                if (dict[word1.charAt(k)-'a'] < dict[word2.charAt(k) -'a']){
                    break;
                } else if (dict[word1.charAt(k)-'a'] > dict[word2.charAt(k) -'a']){
                    return false;
                } else if (k == minlen-1 && word1.length()> word2.length()) {
                    return false;
                }
            }
        }
       return true;
    }
}

//Time Complexity: O(C) c is the total number of chars in words
//Space Complexity: O(1) cosntant using array of size 26.
