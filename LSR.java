import java.util.*;

class LinkStateRouting {
    static int[][] graph = {
        {0, 1, 4, 0},
        {1, 0, 4, 2},
        {4, 4, 0, 3},
        {0, 2, 3, 0}
    };
    
    public static void dijkstra(int source) {
        int nodes = graph.length;
        int[] dist = new int[nodes];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        
        boolean[] visited = new boolean[nodes];
        
        for (int count = 0; count < nodes - 1; count++) {
            int u = minDistance(dist, visited);
            visited[u] = true;
            
            for (int v = 0; v < nodes; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        System.out.println("Shortest paths from node " + source + ":");
        for (int i = 0; i < nodes; i++) {
            System.out.println("Node " + i + ": " + dist[i]);
        }
    }

    private static int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int v = 0; v < dist.length; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        dijkstra(0); // Starting from node 0
    }
}
