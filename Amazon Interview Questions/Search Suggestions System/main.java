//Question URL: https://leetcode.com/problems/search-suggestions-system/

class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> result = new ArrayList<>();
        if (products.length == 0 || searchWord.length() == 0)return result;
        //make the trie
        Trie root = new Trie();
        for (String product: products ) {
            Trie tmp = root;
            for (char c : product.toCharArray()) {
                int i = c-'a';
                if (tmp.children[i] == null) {
                    tmp.children[i] = new Trie();
                }
                tmp = tmp.children[i];
                tmp.words.add(product);
                Collections.sort(tmp.words);
                if (tmp.words.size()>3){
                    tmp.words.remove(tmp.words.size()-1);
                }
            }
        }
        //go over char by char to find the search word
        for (char c : searchWord.toCharArray()) {
            if (root != null){
                root = root.children[c-'a'];
            }
            if (root != null ){
                result.add(root.words);
            }else {
                result.add(new ArrayList<>());
            }

        }
       return result;

    }
    public class Trie {
        Trie[] children ;
        List<String> words;
        public Trie(){
            this.children = new Trie[26];
            this.words= new ArrayList<>();
        }
    }
}
