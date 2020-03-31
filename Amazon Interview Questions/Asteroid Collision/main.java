//Question Link: https://leetcode.com/problems/asteroid-collision/

class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        if(asteroids == null || asteroids.length ==0)return asteroids;
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            if (asteroid> 0) {
                stack.push(asteroid);
            }else {
                while(!stack.isEmpty() && stack.peek() >0 && stack.peek() < Math.abs(asteroid)){
                    stack.pop();
                }
                if (stack.isEmpty() || stack.peek()<0) {
                    stack.push(asteroid);
                } else if (stack.peek() == Math.abs(asteroid)) {
                    stack.pop();
                }

            }
        }
        int[]result = new int[stack.size()];
        for (int i=stack.size()-1; i>=0 ; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}

//Time Complexity: O(N) where n is the number of asteroid in the array
//Space Complexity: O(N)
