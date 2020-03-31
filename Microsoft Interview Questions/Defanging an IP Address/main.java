//Question Link: https://leetcode.com/problems/defanging-an-ip-address/

class Solution {
    public String defangIPaddr(String address) {

        if (address.length()==0)return address;
        StringBuilder result = new StringBuilder();

        for (char c : address.toCharArray()) {
            if(c == '.') {
                result.append("[.]");
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}

//Time Complexity: O(N) -> where N is the number of chars in address, however we know ip address is of a certain length so it can be of O(1) constant time
//Space Complexity: O(N) -> where N is the number of chars in address for String builder, however we know ip address is of a certain length so it can be of O(1) constant time
