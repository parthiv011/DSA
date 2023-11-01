import java.util.ArrayList;

public class graphs {
    public static void main(String[] args) {
        int n = 3, m = 3;
        // ArrayList or List Representation
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        // edge 1 --> 2
        graph.get(1).add(2);
        graph.get(2).add(1);

        // edge 1 --> 3
        graph.get(1).add(3);
        graph.get(3).add(1);

        // edge 2 --> 3
        graph.get(2).add(3);
        graph.get(3).add(2);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }

        // Matrix representation

        // int graph[][] = new int[n + 1][n + 1];

        // // edges
        // graph[1][2] = 1;
        // graph[2][1] = 1;
        // graph[1][3] = 1;
        // graph[3][2] = 1;

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print(" " + graph[i][j]);
        // }
        // System.out.println();
        // }
    }
}