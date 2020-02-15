//Question Link: https://leetcode.com/problems/unique-email-addresses/

class Solution {
    public int numUniqueEmails(String[] emails) {
    // if (emails.length == 0)return 0;
       HashSet <String> hset = new HashSet<>();
        for (String email : emails) {
            StringBuilder res = new StringBuilder();
            for (int i=0; i< email.length(); i++) {
                char c = email.charAt(i);
                if (c =='.' ) {
                    continue;
                } else if (c == '+') {
                    while(email.charAt(i) != '@') {
                        i++;
                    }
                    res.append(email.substring(i));
                    break;
                }else if (c =='@') {
                    res.append(email.substring(i));
                    break;
                } else {
                    res.append(c);
                }

            }
            hset.add(res.toString());
        }
        return hset.size();
    }
}
