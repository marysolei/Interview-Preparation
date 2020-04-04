//Question URL: https://leetcode.com/problems/next-closest-time/

class Solution {
    public String nextClosestTime(String time) {

        int minutes = Integer.parseInt(time.substring(0,2)) *60;
        minutes += Integer.parseInt(time.substring(3));
        //save the digits of given time
        HashSet<Integer> digits = new HashSet<>();
        for (char c : time.toCharArray()) {
            digits.add(c-'0');
        }

        while(true){
            minutes = (minutes+1)%(24*60);
            //first digit , second digit, third and forth
            int[] nextTime  = {minutes/60/10, minutes/60%10, minutes%60/10, minutes%60%10 } ;
            boolean isValid = true;
            for (int digit : nextTime) {
                if (!digits.contains(digit)){
                    isValid= false;
                }
            }
            if (isValid) {
            return String.format("%02d:%02d" , minutes/60, minutes%60);
        }
        }

    }
}

//Time Complexity: O(1) we try up to 24*60 possibilities
//Space Complexity: O(1)

/*main idea: Convert the given time to minutes, incremeant the value of minutes one by one and check if the digits are valid till we get to the time with valid digits(Simulate the clock going forward by one minute. Each time it moves forward, if all the digits are allowed, then return the current time.)
The natural way to represent the time is as an integer t in the range 0 <= t < 24 * 60. Then the hours are t / 60, the minutes are t % 60, and each digit of the hours and minutes can be found by hours / 10, hours % 10 etc.
*/
