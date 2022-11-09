package Spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://www.spoj.com/problems/FISHER/">FISHER - Fishmonger</a>
 * @algorithm Dijkstra / OI Knapsack
 * @since 08-11-2022
 */

class FishmongerSolution1 {

    public static void main(String[] args) throws Exception {
        Reader input = new InputStreamReader(System.in);

        try (BufferedReader reader = new BufferedReader(input)) {
            StringTokenizer tokenizer;

            String line;
            while (!(line = reader.readLine()).equals("0 0")) {
                tokenizer = new StringTokenizer(line);
                int nodes = Integer.parseInt(tokenizer.nextToken());
                int maxTime = Integer.parseInt(tokenizer.nextToken());

                Edge[][] edges = new Edge[nodes][nodes];

                for (int i = 0; i < nodes; i++) {
                    tokenizer = new StringTokenizer(reader.readLine());
                    for (int j = 0; j < nodes; j++) {
                        int time = Integer.parseInt(tokenizer.nextToken());
                        edges[i][j] = new Edge(j, time, Integer.MAX_VALUE);
                    }
                }

                reader.readLine();

                for (int i = 0; i < nodes; i++) {
                    tokenizer = new StringTokenizer(reader.readLine());
                    for (int j = 0; tokenizer.hasMoreTokens(); j++) {
                        edges[i][j].toll = Integer.parseInt(tokenizer.nextToken());
                    }
                }

                reader.readLine();

                int[] result = dijkstra(edges, 0, nodes - 1, maxTime);
                System.out.printf("%d %d\n", result[0], result[1]);
            }
        }
    }

    private static int[] dijkstra(Edge[][] edges, int start, int end, int maxTime) {
        boolean[] visited = new boolean[edges.length];
        Queue<Edge> queue = new PriorityQueue<>();

        visited[0] = true;
        queue.offer(edges[start][0]);

        while (!queue.isEmpty()) {
            Edge u = queue.poll();

            if (u.vertex == end) {
                return new int[]{u.toll, u.time};
            } else {
                for (int i = 0; i < edges[u.vertex].length; i++) {
                    Edge edge = edges[u.vertex][i];
                    if (!visited[u.vertex] || edge.time != 0 && u.time + edge.time <= maxTime) {
                        visited[u.vertex] = true;
                        queue.add(new Edge(i, u.time + edge.time, u.toll + edge.toll));
                    }
                }
            }
        }

        return new int[]{-1, -1};
    }

    private static class Edge implements Comparable<Edge> {

        private int vertex, time, toll;

        private Edge(int vertex, int time, int toll) {
            this.vertex = vertex;
            this.time = time;
            this.toll = toll;
        }

        @Override
        public int compareTo(Edge v) {
            return this.toll - v.toll;
        }
    }
}

class FishmongerSolution2 {

    public static void main(String[] args) throws Exception {
        Reader input = new InputStreamReader(System.in);

        try (BufferedReader reader = new BufferedReader(input)) {
            StringTokenizer tokenizer;

            String line;
            while (!(line = reader.readLine()).equals("0 0")) {
                tokenizer = new StringTokenizer(line);
                int n = Integer.parseInt(tokenizer.nextToken());
                int maxTime = Integer.parseInt(tokenizer.nextToken());

                Item[][] items = new Item[n][n];

                for (int i = 0; i < n; i++) {
                    tokenizer = new StringTokenizer(reader.readLine());
                    for (int j = 0; j < n; j++) {
                        int time = Integer.parseInt(tokenizer.nextToken());
                        items[i][j] = new Item(time, Integer.MAX_VALUE);
                    }
                }

                reader.readLine();

                for (int i = 0; i < n; i++) {
                    tokenizer = new StringTokenizer(reader.readLine());
                    for (int j = 0; tokenizer.hasMoreTokens(); j++) {
                        items[i][j].toll = Integer.parseInt(tokenizer.nextToken());
                    }
                }

                reader.readLine();

                int[] result = zeroOneKnapsack(n, maxTime, items);
                System.out.printf("%d %d\n", result[0], result[1]);
            }
        }
    }

    private static int[] zeroOneKnapsack(int n, int totalTime, Item[][] items) {
        int[][] dp = new int[n + 1][totalTime + 1];

        for (int i = 1; i <= n; ++i) {
            dp[i][0] = (int) 10e6;
        }

        int minTime = (int) 10e6;
        for (int i = 1; i <= totalTime; ++i) {
            for (int j = 0; j < n; ++j) {
                dp[j][i] = dp[j][i - 1];
                for (int k = 0; k < n; ++k) {
                    Item item = items[k][j];
                    if (i >= item.time) {
                        dp[j][i] = Math.min(item.toll + dp[k][i - item.time], dp[j][i]);
                    }
                }
            }

            if (dp[n - 1][i] != dp[n - 1][i - 1]) {
                minTime = i;
            }
        }

        return new int[]{dp[n - 1][minTime], minTime};
    }

    private static class Item {

        private int time, toll;

        public Item(int time, int toll) {
            this.time = time;
            this.toll = toll;
        }
    }
}