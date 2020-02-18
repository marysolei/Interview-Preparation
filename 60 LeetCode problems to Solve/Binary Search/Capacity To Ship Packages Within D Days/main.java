//Question Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

class Solution {
    public int shipWithinDays(int[] weights, int D) {

        int start = 0 ;
        int end = 0 ;

        for (int w : weights) {
         start = Math.max(start, w);
            end += w;
        }

        while (start< end) {

            int mid =(start+end) /2 ;
            int need =1 ;
            int cur = 0;
            for (int w : weights) {
                if (cur+w > mid) {
                    need +=1;
                    cur =0;
                }
                cur+= w;
            }
            if (need > D) {
                start = mid+1;
            } else{
            end= mid;
            }
        }
        return start;
    }
}
