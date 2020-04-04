//Question Link: https://leetcode.com/problems/boats-to-save-people/

class Solution {
    public int numRescueBoats(int[] people, int limit) {

        if (people.length == 0 || limit==0)return 0;
        int numBoats= 0;
        Arrays.sort(people);
        int i =0;
        int j = people.length-1;
        while (i<=j) {
            numBoats++;
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
        }
        return numBoats;
    }
}


//Time Complexity: O(NlogN), where N is the length of people, because of sorting the array.
//Space Complexity: O(N).

/*
Let people[i] to the currently lightest person, and people[j] to the heaviest.
Then, if the heaviest person can share a boat with the lightest person (if people[j] + people[i] <= limit) then do so; otherwise, the heaviest person sits in their own boat.

*/
