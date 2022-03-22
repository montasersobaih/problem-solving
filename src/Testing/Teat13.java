package Testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Teat13 {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine());
        for (int i = 0; i < loop; i++) {
            StringTokenizer token = new StringTokenizer(b.readLine());
            int vertex = Integer.parseInt(token.nextToken()), edge = Integer.parseInt(token.nextToken());
            LinkedList<Vertex>[] adj = new LinkedList[vertex];
            for (int j = 0; j < vertex; j++) {
                adj[j] = new LinkedList<Vertex>();
            }

            for (int j = 0; j < edge; j++) {
                token = new StringTokenizer(b.readLine());
                int vertex1 = Integer.parseInt(token.nextToken()) - 1, vertex2 = Integer.parseInt(token.nextToken()) - 1,
                        cost = Integer.parseInt(token.nextToken());
                adj[vertex1].add(new Vertex(vertex2, cost));
                adj[vertex2].add(new Vertex(vertex1, cost));
            }

            token = new StringTokenizer(b.readLine());
            int start = Integer.parseInt(token.nextToken()) - 1, goal = Integer.parseInt(token.nextToken()) - 1;
            boolean[] visited = new boolean[vertex];
            int[] costGoal = new int[visited.length];
            Arrays.fill(costGoal, Integer.MAX_VALUE);
            PriorityQueue<Path> que = new PriorityQueue<Path>();
            que.offer(new Path(start, 0));
            costGoal[start] = 0;

            while (!que.isEmpty()) {
                Path p = que.poll();
                if (p.getVertex() == goal) {
                    System.out.printf("Case %d: %d", i + 1, p.getCost());
                    return;
                } else if (visited[p.getVertex()]) {
                    continue;
                }

                visited[p.getVertex()] = true;
                for (Vertex v : adj[p.getVertex()]) {
                    if (v.getCost() + p.getCost() < costGoal[v.getVertex()]) {
                        costGoal[v.getVertex()] = v.getCost() + p.getCost();
                        que.offer(new Path(v.getVertex(), costGoal[v.getVertex()]));
                    }
                }
            }
        }
    }

    private static class Vertex {
        private int vertex, cost;

        public Vertex(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

        public int getVertex() {
            return vertex;
        }

        public int getCost() {
            return cost;
        }
    }

    private static class Path implements Comparable<Path> {
        private int vertex, cost;

        public Path(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

        public int getVertex() {
            return vertex;
        }

        public int getCost() {
            return cost;
        }

        @Override
        public int compareTo(Path o) {
            return Integer.compare(this.cost, o.cost);
        }
    }
}