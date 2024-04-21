class Solution {
    private int[] parent;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        parent = new int[n];
        for (int i = 0; i < n; ++i) {
            parent[i] = i;
        }
      
        for (int[] edge : edges) {
            parent[find(edge[0])] = find(edge[1]);
        }
      
        return find(source) == find(destination);
    }

    private int find(int x) {
        if (parent[x] != x) { 
            parent[x] = find(parent[x]); 
        }
        return parent[x]; 
    }
}