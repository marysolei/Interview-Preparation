//Question Link:https://leetcode.com/problems/intersection-of-two-arrays/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

       // if ( nums1.length ==0 || nums2.length ==0) return null;

        Set<  Integer> hmap1 = new HashSet<>();
         Set<  Integer> hmap2 = new HashSet<>();
        for (int num:nums1){
            hmap1.add(num);
        }
        for (int num2:nums2){
            if (hmap1.contains(num2)){
                hmap2.add(num2);
            }
        }
        int[]res = new int[hmap2.size()];
        int cnt =0;
        for(int n:hmap2){
            res[cnt]= n;
            cnt++;
        }
        return res;
    }

}
