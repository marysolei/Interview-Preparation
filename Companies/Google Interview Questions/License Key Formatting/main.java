//Question Link: https://leetcode.com/problems/license-key-formatting/

class Solution {
    public String licenseKeyFormatting(String S, int K) {

        if (S.length() == 0 || K ==0 )return S;
        int i = S.length()-1;
        int cnt =0;
        StringBuilder result = new StringBuilder();
        while (i>= 0) {
            char current = Character.toUpperCase(S.charAt(i));
            if (current == '-'){
                i--;
            }else if (cnt !=0 && cnt%K==0){
                result.insert(0,'-');
                cnt =0;
            } else {
                result.insert(0, current);
                cnt++;
                i--;
            }
        }
        return result.toString();
    }
}
