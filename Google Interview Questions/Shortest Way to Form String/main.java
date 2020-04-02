//Question Link: https://leetcode.com/problems/shortest-way-to-form-string/

class Solution {
    public int shortestWay(String source, String target) {
        if (source.length() == 0)return -1;
        int res =0;
        String remaining=target;

        while(remaining.length()>0) {
            StringBuilder subsequence = new StringBuilder();
            int i=0;
            int j =0;
            while(i<source.length() && j< remaining.length()){
                if (source.charAt(i++) == remaining.charAt(j)) {
                    subsequence.append(remaining.charAt(j));
                    j++;
                }

            }
            if (subsequence.length()==0)return -1;
            res++;
            remaining= remaining.substring(subsequence.length());

        }
        return res;
    }
}

//Time Complexity: O(M*N) where M is the number of chars in source and N is the number of chars in target.

//Space Complexity: O(N) string builder of size of target
