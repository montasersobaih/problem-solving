package Testing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Fishmonger {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int n = parseInt(tokenizer.nextToken()), total = parseInt(tokenizer.nextToken());
            if (n == 0 && total == 0) {
                break;
            }

            int[][] time = new int[55][55], toll = new int[55][55];
            for (int i = 0; i < n; i++) {
                tokenizer = new StringTokenizer(reader.readLine());
                for (int j = 0; j < n; j++) {
                    time[i][j] = parseInt(tokenizer.nextToken());
                }
            }

            reader.readLine();

            for (int i = 0; i < n; i++) {
                tokenizer = new StringTokenizer(reader.readLine());
                for (int j = 0; j < n; j++) {
                    toll[i][j] = parseInt(tokenizer.nextToken());
                }
            }

            reader.readLine();

            int[] result = dijkstra(n, total, time, toll);
            writer.write(result[0] + " " + result[1]);
            writer.newLine();
        }
        writer.flush();
    }

    private static int[] dijkstra(int n, int total, int[][] time, int[][] toll) {
        PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>();
        boolean[][] visited = new boolean[55][1005];
        int[][] dist = new int[55][1005];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        dist[0][0] = 0;
        visited[0][0] = true;
        queue.offer(new Vertex(0, 0, 0));
        while (!queue.isEmpty()) {
            Vertex vertex = queue.poll();
            int u = vertex.getVertex(), toll1 = vertex.getToll(), time1 = vertex.getTime();
            if (u == n - 1) {
                return new int[]{toll1, time1};
            }

            if (visited[u][time1]) {
                continue;
            }
            visited[u][time1] = true;
            for (int v = 0; v < n; v++) {
                if (v != u) {
                    int nt = time1 + time[u][v];
                    if (nt <= total) {
                        int nc = toll1 + toll[u][v];
                        if (nc < dist[v][nt]) {
                            dist[v][nt] = nc;
                            queue.offer(new Vertex(v, nt, nc));
                        }
                    }
                }
            }
        }

        return new int[]{-1, -1};
    }

    private static int parseInt(String convert) {
        return Integer.parseInt(convert);
    }

    private static class Vertex implements Comparable<Vertex> {
        private int vertex, time, toll;

        public Vertex(int vertex, int time, int toll) {
            this.vertex = vertex;
            this.time = time;
            this.toll = toll;
        }

        public int getVertex() {
            return vertex;
        }

        public int getTime() {
            return time;
        }

        public int getToll() {
            return toll;
        }

        @Override
        public int compareTo(Vertex o) {
            int result = 0;
            if (this.getToll() != o.getToll()) {
                result = this.getToll() - o.getToll();
            } else {
                result = this.getTime() - o.getTime();
            }

            return result;
        }
    }
}
