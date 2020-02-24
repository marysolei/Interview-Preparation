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
