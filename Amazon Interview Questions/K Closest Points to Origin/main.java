//Question Link: https://leetcode.com/problems/k-closest-points-to-origin/

class Solution {
    public int[][] kClosest(int[][] points, int K) {
        if (points == null || points.length == 0 )return points;
        PriorityQueue <int[]> minHeap = new PriorityQueue<>((a,b) -> (a[0]*a[0] +a[1]*a[1]) -(b[0]*b[0] + b[1]*b[1]));

        for (int[] point : points) {
            minHeap.add(point) ;
        }
        int[][] result = new int[K][2];
        for (int i=0; i<K ;i++) {
            result[i] = (minHeap.poll());
        }
        return result;
    }
}
