//Question Link: https://leetcode.com/problems/unique-email-addresses/

class Solution {
    public int numUniqueEmails(String[] emails) {

        if (emails == null || emails.length == 0)return 0;
        Set<String> freq = new HashSet<>();

        for (String email : emails) {

            int index = email.indexOf("@");
            String local = email.substring(0,index);
            String domain = email.substring(index);
            local = local.replaceAll("\\.","");
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf("+"));
            }
            freq.add(local+domain);
        }
        return freq.size();
    }
}


//Time Complexity: O(C), where C is the total content of emails.
//Space Complexity: O(C). 
