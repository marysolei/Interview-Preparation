//Question Link: https://leetcode.com/problems/reverse-vowels-of-a-string/

class Solution {
    public String reverseVowels(String s) {

        if (s== null || s.length()==0)return s;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        int i=0;
        int j=s.length()-1;
        char[] sArr = s.toCharArray();
        while (i<j) {
            while (i<j && !vowels.contains(sArr[i])) {
                i++;
            }
            while ( i<j && !vowels.contains(sArr[j])){
                j--;
            }
            char tmp = sArr[i];
            sArr[i] = sArr[j];
            sArr[j] = tmp;
            i++;
            j--;

        }
        return new String(sArr);
    }
}
