//Question Link: https://leetcode.com/problems/critical-connections-in-a-network/

class Solution {
    int cnt =0;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {

        List<List<Integer>>  res = new ArrayList<>();
        int[] ids = new int[n];
        int[] lows = new int[n];
        Arrays.fill(ids, -1);
        boolean[]visited = new boolean[n];
        //edge cases
        if (n ==0 || connections.size() ==0)return res;

        //make the graph
        Map<Integer, List<Integer>> graph = buildG(n, connections);

        //dfs the graph
        for (int i=0; i< n ; i++) {
            if (!visited[i]){
            dfs(graph, visited, res, i, -1, ids, lows);
            }
        }
        return res;
    }
    public Map<Integer, List<Integer>> buildG (int n , List<List<Integer>> connections){

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i=0; i< n ; i++) {
            if (!graph.containsKey(i)) {
                graph.put(i, new ArrayList<>());
            }
        }
        for (List<Integer> connection : connections) {
            int from = connection.get(0);
            int to = connection.get(1);
            graph.get(from).add(to);
            graph.get(to).add(from);
        }
        return graph;
    }
     public void dfs(Map<Integer, List<Integer>> graph, boolean[] visited ,List<List<Integer>>  res ,int at, int parent, int[] ids, int[] lows   ) {

        visited[at] = true;
        cnt++;
        ids[at]= lows[at]=cnt;
        List<Integer>children = graph.get(at);
        for (int to: children) {
            if (to == parent)continue;
            if (!visited[to]) {
               dfs(graph, visited, res, to, at, ids, lows);
                lows[at]= Math.min(lows[at], lows[to]);
                if (ids[at]<lows[to]) {
                 if (at>to) {
                    res.add(Arrays.asList(to, at));
                 } else {
                      res.add(Arrays.asList(at, to));
                 }
                }
            } else {
                lows[at]= Math.min(lows[at], ids[to]);
            }
        }

    }
}
