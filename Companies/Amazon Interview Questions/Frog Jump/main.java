//Question URL: https://leetcode.com/problems/frog-jump/

class Solution {
    public boolean canCross(int[] stones) {
        for (int i=3; i< stones.length; i++) {
            if (stones[i]> stones[i-1]*2) {
                return false;
            }
        }
        if(stones[1] > 1) return false;
        if(stones.length == 2) return true;
        Stack<Integer> positions = new Stack<>();
        Stack<Integer> jumps = new Stack<>();
        positions.add(0);
        jumps.add(0);
        int lastPosition = stones[stones.length-1];
        Set<Integer> hset = new HashSet<>();
        for (int stone : stones) {
            hset.add(stone);
        }
        while (!positions.isEmpty()) {
           // if (positions.pop() == lastPosition ) return true;
            int position = positions.pop();
            int jump = jumps.pop();
            for (int i =jump-1; i<= jump+1; i++) {
                if (i<=0){
                    continue;
                }
                int nextposition = i+ position;
                if (nextposition == lastPosition ) {
                    return true;
                } else if (hset.contains(nextposition)) {
                    positions.add(nextposition);
                    jumps.add(i);

                }
            }
        }
        return false;
    }
}
