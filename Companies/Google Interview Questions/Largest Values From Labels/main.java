//Question Link: https://leetcode.com/problems/largest-values-from-labels/


class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {

        List<Item> items = new ArrayList<>();
        for (int i= 0; i< values.length; i++) {
            items.add(new Item(values[i], labels[i]));
        }
        PriorityQueue<Item> maxHeap= new PriorityQueue<>((Item a, Item b) -> b.value -a.value);
        maxHeap.addAll(items);
        HashMap<Integer, Integer> counts = new HashMap<>();

        int res =0;
        while (!maxHeap.isEmpty() && num_wanted> 0){
            Item current = maxHeap.poll();
            counts.put(current.label,counts.getOrDefault(current.label,0)+1);
            if (counts.get(current.label) <=use_limit) {
                res+= current.value;
                num_wanted --;
            }
        }
        return res;

    }
    public class Item {
        int value;
        int label;
        public Item (int value, int label) {
            this.value = value;
            this.label = label;
        }
    }
}


//Time Complexity: O(NlogN) -> using heap and N is the number of items
//Space Complexity O(N) -> sorting N elements in heap
