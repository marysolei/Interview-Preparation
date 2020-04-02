//Question Link: https://leetcode.com/problems/keys-and-rooms/

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

       if (rooms == null || rooms.size() ==0)return false;

        HashSet<Integer> visited = new HashSet<>();
        visited.add(0);
        Stack<Integer> keyStack= new Stack<>();
        keyStack.add(0);

        while(!keyStack.isEmpty()) {
            List<Integer> keys = rooms.get(keyStack.pop());
            for (int key : keys) {
                if (!visited.contains(key)) {
                visited.add(key);
                keyStack.add(key);
                }
            }
        }
       return visited.size() == rooms.size();
    }
}

//Time Complexity: O(N+K) where N is the number of rooms and K is the number of keys
//Space Complexity: O(N) we need for stack and visited
