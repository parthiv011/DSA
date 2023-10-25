public class FlyodWarshallsAlgo {
    static int inf = 99999, v = 4;

    public void pairShortest(int dist[][]) {
        int i, j, k;

        for (i = 0; i < v; i++) {
            for (j = 0; j < v; j++) {
                for (k = 0; k < v; k++) {
                    if (dist[j][i] + dist[i][k] < dist[j][k]) {
                        dist[j][k] = dist[j][i] + dist[i][k];
                    }
                }
            }
        }
    }

    private void print(int dist[][]) {
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (dist[i][j] == inf) {
                    System.out.print("Inf" + " ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int dist[][] = {
                { inf, 25, 13, 8 },
                { 25, inf, 7, 6 },
                { 13, 7, inf, 2 },
                { 8, 6, 2, inf }
        };
        FlyodWarshallsAlgo test = new FlyodWarshallsAlgo();
        test.pairShortest(dist);
        test.print(dist);
    }
}