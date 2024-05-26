
class Solution {

    public int minReorder(int n, int[][] connections) {

        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] conn : connections) {
            graph.get(conn[0]).add(new int[]{conn[1], 1});
            graph.get(conn[1]).add(new int[]{conn[0], 0});
        }

        return dfs(0, -1, graph);
    }

    private int dfs(int node, int parent, List<List<int[]>> graph) {

        int changes = 0;

        for (int[] neighbor : graph.get(node)) {

            if (neighbor[0] != parent) {
                changes += neighbor[1] + dfs(neighbor[0], node, graph);
            }
        }
        return changes;
    }
}


