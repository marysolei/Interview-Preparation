//Question URL: https://leetcode.com/problems/repeated-dna-sequences/

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

       HashSet<String> res =  new HashSet<>();
        int l = 10;
        HashSet<String> seen = new HashSet<>();
        for (int i=0; i< s.length()-l+1; i++){
            String tmp = s.substring(i, i+l);
            if (seen.contains(tmp)) {
                res.add(tmp);
            }
            seen.add(tmp);
        }
        return new ArrayList<>(res);
    }
}

//Time complexity : O((N−L)L), that is O(N) for the constant L=10. In the loop executed N−L+1 //one builds a substring of length L. Overall that results in O((N−L)L) time complexity.

//Space complexity : O((N−L)L) to keep the hashset, that results in O(N) for the constant L=10. 
