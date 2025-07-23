class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
    
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());
    
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        boolean[] visited = new boolean[n];
        return dfs(graph, source, destination, visited);
    }

    public boolean dfs(List<List<Integer>> graph, int current, int destination, boolean[] visited) {
        if (current == destination)
            return true;

        visited[current] = true;

        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                if (dfs(graph, neighbor, destination, visited))
                    return true;
            }
        }

        return false;
    }
}
