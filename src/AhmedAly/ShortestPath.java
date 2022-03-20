package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ShortestPath {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int tc = Integer.parseInt(tokenizer.nextToken());
        while (tc-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken()), start = Integer.parseInt(tokenizer.nextToken());

            char[][] edges = new char[n][n];
            for (int i = 0; i < n; i++) {
                edges[i] = reader.readLine().toCharArray();
            }

            ZeroOneDijkstra(n, start - 1, edges);
        }
    }

    private static void ZeroOneDijkstra(int n, int start, char[][] edges) {
        boolean[] visited = new boolean[n];
        int[] dist = new int[n];
        Arrays.fill(dist, -1);

        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.offer(start);
        dist[start] = 0;

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            visited[vertex] = true;

            int length = edges[vertex].length;
            char[] connected = edges[vertex];
            for (int i = 0; i < length; i++) {
                int edge = connected[i] - '0';
                if (edge != 0) {
                    if (dist[vertex] + edge < dist[i] || !visited[i]) {
                        dist[i] = dist[vertex] + edge;
                        queue.offer(i);
                        visited[i] = true;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }
}