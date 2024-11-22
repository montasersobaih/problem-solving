package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class ShortestPath {

    public static void main(String[] args) throws Exception {
        Reader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        StringTokenizer tokenizer;

        int tc = Integer.parseInt(reader.readLine());
        while (tc-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());

            int n = Integer.parseInt(tokenizer.nextToken());
            int start = Integer.parseInt(tokenizer.nextToken());

            int[][] adjacency = new int[n][n];
            for (int i = 0; i < n; i++) {
                String line = reader.readLine();
                for (int j = 0; j < line.length(); j++) {
                    adjacency[i][j] = line.charAt(i) - '0';
                }
            }

            int[] dist = zeroOneDijkstra(adjacency, start - 1);

            StringJoiner joiner = new StringJoiner(" ");
            for (int value : dist) {
                joiner.add(String.valueOf(value));
            }

            System.out.println(joiner);
        }
    }

    private static int[] zeroOneDijkstra(int[][] adjacency, int start) {
        boolean[] visited = new boolean[adjacency.length];
        int[] dist = new int[adjacency.length];

        Arrays.fill(dist, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        dist[start] = 0;

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            visited[vertex] = true;

            int[] edges = adjacency[vertex];
            for (int dVertex = 0; dVertex < edges.length; dVertex++) {
                if (edges[dVertex] != 0 && (!visited[dVertex] || dist[vertex] + edges[dVertex] < dist[dVertex])) {
                    dist[dVertex] = dist[vertex] + edges[dVertex];
                    visited[dVertex] = true;
                    queue.offer(dVertex);
                }
            }
        }

        return dist;
    }
}