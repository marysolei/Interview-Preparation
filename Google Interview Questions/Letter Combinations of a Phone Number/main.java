//Question Link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/

class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() ==0)return result;
        Map<Character, String> combination = new HashMap<>();
        combination.put('2', "abc");
        combination.put('3', "def");
        combination.put('4', "ghi");
        combination.put('5', "jkl");
        combination.put('6', "mno");
        combination.put('7', "pqrs");
        combination.put('8', "tuv");
        combination.put('9', "wxyz");
        String current ="";
        helper(digits, current, combination, result, 0);
        return result;
    }
    public void helper(String digits, String current, Map<Character, String> hmap,List<String> result, int index) {
        if (current.length( ) == digits.length()) {
            result.add(current);
            return;
        }
        char c = digits.charAt(index);
        String letters = hmap.get(c);
        for (int i=0; i<letters.length() ; i++){
            helper(digits, current+letters.charAt(i), hmap,result, index+1);
        }
    }
}
