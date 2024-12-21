import java.util.*;

class DistanceVectorRouting {
    static final int INFINITY = 999;
    static int[][] distanceTable;

    public static void updateTable(int[][] graph, int nodes) {
        int[][] newTable = new int[nodes][nodes];
        for (int i = 0; i < nodes; i++) {
            for (int j = 0; j < nodes; j++) {
                newTable[i][j] = graph[i][j];
            }
        }

        for (int i = 0; i < nodes; i++) {
            for (int j = 0; j < nodes; j++) {
                for (int k = 0; k < nodes; k++) {
                    if (newTable[i][j] > newTable[i][k] + newTable[k][j]) {
                        newTable[i][j] = newTable[i][k] + newTable[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < nodes; i++) {
            System.out.println("Distance Vector for node " + i + ": " + Arrays.toString(newTable[i]));
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, INFINITY, INFINITY},
            {1, 0, 1, 1},
            {INFINITY, 1, 0, 1},
            {INFINITY, 1, 1, 0}
        };
        updateTable(graph, 4);
    }
}
