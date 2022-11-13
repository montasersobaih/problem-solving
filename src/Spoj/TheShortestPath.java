package Spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://www.spoj.com/problems/SHPATH/">SHPATH - The Shortest Path</a>
 * @algorithm Dijkstra
 * @note This problem has two tricks:-<br/>
 * <ol>
 *     <li>You should use <b>ArrayList</b> instead of <b>LinkedList</b> because it's faster in accessing.</li>
 *     <li>The input may contains an empty lines, you can handle it as you want.</li>
 * </ol>
 * @since 13-11-2022
 */

public class TheShortestPath {

    public static void main(String[] args) {
        FastReader reader = new FastReader();

        int tc = reader.nextInt();
        while (tc-- > 0) {
            int vNumber = reader.nextInt();

            List<Edge>[] adjacency = new List[vNumber];
            for (int i = 0; i < vNumber; i++) {
                adjacency[i] = new ArrayList<>();
            }

            Map<String, Integer> cities = new HashMap<>();
            for (int i = 0; i < vNumber; i++) {
                cities.put(reader.nextLine(), i);

                int eNumber = reader.nextInt();
                for (int j = 0; j < eNumber; j++) {
                    int dest = reader.nextInt();
                    int weight = reader.nextInt();

                    adjacency[i].add(new Edge(dest - 1, weight));
                }
            }

            int fNumber = reader.nextInt();
            for (int i = 0; i < fNumber; i++) {
                int from = cities.get(reader.next());
                int dest = cities.get(reader.next());

                System.out.println(dijkstra(adjacency, from, dest));
            }
        }
    }

    private static int dijkstra(List<Edge>[] adjacency, int start, int dest) {
        Queue<Edge> queue = new PriorityQueue<>();
        int[] weights = new int[adjacency.length];

        Arrays.fill(weights, Integer.MAX_VALUE);

        weights[start] = 0;
        queue.offer(new Edge(start, 0));

        while (!queue.isEmpty()) {
            Edge oEdge = queue.poll();

            if (oEdge.vertex == dest) {
                return weights[oEdge.vertex];
            }

            for (Edge edge : adjacency[oEdge.vertex]) {
                if (weights[oEdge.vertex] + edge.weight < weights[edge.vertex]) {
                    weights[edge.vertex] = weights[oEdge.vertex] + edge.weight;
                    queue.offer(new Edge(edge.vertex, weights[edge.vertex]));
                }
            }
        }

        return -1;
    }

    private static class FastReader {

        private final BufferedReader reader;

        private StringTokenizer tokenizer;

        private FastReader() {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }

        private String next() {
            while (tokenizer == null || !tokenizer.hasMoreElements()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return tokenizer.nextToken();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }

        private String nextLine() {
            String str = "";
            try {
                str = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    private static class Edge implements Comparable<Edge> {

        private final int vertex;

        private final int weight;

        public Edge(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
    }
}