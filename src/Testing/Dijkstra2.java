package Testing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Dijkstra2 {
    public static void main(String[] args) throws Exception {
        long s = System.currentTimeMillis();
        BufferedReader reader = new BufferedReader(new FileReader("Input.txt"));

        StringTokenizer token = new StringTokenizer(reader.readLine());
        int vertices = parseInt(token.nextToken()), edges = parseInt(token.nextToken());

        Map<Integer, List<Vertex>> adj = new HashMap<Integer, List<Vertex>>();
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < edges; i++) {
            token = new StringTokenizer(reader.readLine());
            int from = parseInt(token.nextToken()), to = parseInt(token.nextToken()), weight = parseInt(token.nextToken());

            if (set.add(from)) {
                adj.put(from, new LinkedList<Vertex>());
                adj.get(from).add(new Vertex(to, weight, Integer.MAX_VALUE));
            } else {
                adj.get(from).add(new Vertex(to, weight, Integer.MAX_VALUE));
            }

            if (set.add(to)) {
                adj.put(to, new LinkedList<Vertex>());
                adj.get(to).add(new Vertex(from, weight, Integer.MAX_VALUE));
            } else {
                adj.get(to).add(new Vertex(from, weight, Integer.MAX_VALUE));
            }
        }

        token = new StringTokenizer(reader.readLine());
        int start = parseInt(token.nextToken()), end = parseInt(token.nextToken());
        Vertex v = dijkstra(adj, start, end, vertices);

        System.out.printf("The distance between %s and %s is --> %d\n", start, end, v.getMindis());
        System.out.printf("The path is %s\n", v.getPath());
        System.out.printf("Execution time is %.5f second", (System.currentTimeMillis() - s) / 1000d);
    }

    private static Vertex dijkstra(Map<Integer, List<Vertex>> adj, int start, int end, int verteces) {
        boolean[] isvisited = new boolean[verteces + 1];
        Queue<Vertex> queue = new LinkedList<Vertex>();
        Vertex vx = new Vertex(start, 0, 0);
        isvisited[vx.getName()] = true;
        vx.setPath(vx.getPath() + start);
        queue.offer(vx);

        while (!queue.isEmpty()) {
            Vertex u = queue.poll();
            if (u.getName() == end) {
                return u;
            } else {
                List<Vertex> list = adj.get(u.getName());
                for (Vertex v : list) {
                    if (!isvisited[Character.toUpperCase(vx.getName())] || v.getWeight() + u.getMindis() < v.getMindis()) {
                        v.setPath(u.getPath() + " -> " + v.getName());
                        isvisited[Character.toUpperCase(vx.getName())] = true;
                        v.setMindis(v.getWeight() + u.getMindis());
                        queue.add(v);
                    }
                }
            }
        }
        return null;
    }

    private static class Vertex {
        private int name;
        private int weight, mindis;
        private boolean isvisited;
        private String path;

        public Vertex(int name, int weight, int mindis) {
            this.name = name;
            this.weight = weight;
            this.mindis = mindis;
            this.isvisited = false;
            this.path = "";
        }

        public int getName() {
            return name;
        }

        public int getWeight() {
            return weight;
        }

        public int getMindis() {
            return mindis;
        }

        public void setMindis(int mindis) {
            this.mindis = mindis;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }
    }
}