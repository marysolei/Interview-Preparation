//Question: https://leetcode.com/problems/analyze-user-website-visit-pattern/


class Solution {
    public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {

        // Convert all entries to visit object
        List<Visit> visits = new ArrayList<>();
        for (int i=0; i< username.length ; i++) {
            visits.add(new Visit(username[i], timestamp[i], website[i]));
        }
        //sort the visit objects based on time stamp
        Collections.sort(visits, (a,b) -> a.timeStamp-b.timeStamp);

        //get all the websites for each user
        HashMap<String, List<String>> userWebsiteMap= new HashMap<>();
        for (Visit v : visits){
            userWebsiteMap.putIfAbsent(v.username, new ArrayList<>());
            userWebsiteMap.get(v.username).add(v.website);
        }

        HashMap<List<String>, Integer> sequenceUserMap = new HashMap<>();
        //get all the websites for each user
        for (List<String> websiteList : userWebsiteMap.values()){

            if (websiteList.size()<3)continue;
            Set<List<String>> sequenceSet = generateSequence(websiteList);

            for(List<String> seq: sequenceSet) {
                sequenceUserMap.putIfAbsent(seq,0);
                sequenceUserMap.put(seq, sequenceUserMap.get(seq)+1);
            }
        }

        List<String> result = new ArrayList<>();
        int MAX =0;
       for(Map.Entry<List<String>,Integer> entry:sequenceUserMap.entrySet()){
        	if(entry.getValue() > MAX){
        		MAX=entry.getValue();
        		result=entry.getKey();
        	}
        	else if(entry.getValue() == MAX){
        		if(entry.getKey().toString().compareTo(result.toString()) < 0){
        			result=entry.getKey();
        		}
        	}
        }
        return result;


    }
    public Set<List<String>> generateSequence(List<String> websiteList){

        Set<List<String>> result = new HashSet<>();
        for (int i=0; i< websiteList.size(); i++) {
             for (int j=i+1; j< websiteList.size(); j++) {
                  for (int k=j+1; k< websiteList.size(); k++) {
                      List<String> newList= new ArrayList<>();
                      newList.add(websiteList.get(i));
                      newList.add(websiteList.get(j));
                      newList.add(websiteList.get(k));
                      result.add(newList);
                  }
             }
        }
        return result;
        }



    public class Visit{
        String username;
        int timeStamp;
        String website;

        public Visit (String user, int time, String website){
            this.username = user;
            this.timeStamp = time;
            this.website = website;
        }
    }
}
