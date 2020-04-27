//Question Link: https://leetcode.com/problems/meeting-rooms-ii/

class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0)return 0;
        Arrays.sort(intervals, (a,b) -> (a[0]-b[0]));
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> (a[1] - b[1]));
        minHeap.add(intervals[0]);
        for (int i=1; i< intervals.length; i++) {
            int[] current = intervals[i];
            int[] earliest =minHeap.poll();
            if (current[0] >= earliest[1]) {
                earliest[1]= current[1];
            }else {
                minHeap.add(intervals[i]);
            }
            minHeap.add(earliest);
        }
        return minHeap.size();
    }
}

//Time Complexity: O(NlogN)
/*sorting of the array that takes O(NlogN) considering that the array consists of N elements.
Then we have the min-heap. In the worst case, all N meetings will collide with each other. In any case we have N add operations on the heap. In the worst case we will have N extract-min operations as well. Overall complexity being (NlogN) since extract-min operation on a heap takes O(logN).
*/

//Space Complexity: O(N) minHeap of N elements
