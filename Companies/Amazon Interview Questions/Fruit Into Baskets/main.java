//Question URL: https://leetcode.com/problems/fruit-into-baskets/

class Solution {
    public int totalFruit(int[] tree) {

        if (tree == null || tree.length ==0)return 0;

        //if there is a tree then we have at least one fruit
        int max =1;
        //map of values and their occuring indexes
        HashMap<Integer, Integer> hmap = new HashMap<>();

        int i=0;
        int j=0;
        while (j< tree.length){
            if (hmap.size()<=2){
                hmap.put(tree[j], j++);
            }
            if (hmap.size() >2) {
                //find the min index in the hmap
                int min = tree.length -1;
                for (int value : hmap.values()) {
                    min = Math.min(min, value);
                }
                //left index should move one ahead from the current
                i = min+1;
                //remove the left most element in the sliding window
                hmap.remove(tree[min]);
            }
            //find if the numbers in current sliding window is max or not
            max = Math.max(max, j-i);
        }
        return max;
    }
}

//Time Complexity: O(N), where N is the length of tree.
//Space Complexity: O(N). hash map of array elements
