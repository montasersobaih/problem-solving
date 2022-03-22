package Testing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Dijkstra {
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
        Queue<Vertex> queue = new PriorityQueue<Vertex>();
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

    private static class Vertex implements Comparable<Vertex> {
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

        @Override
        public int compareTo(Vertex o) {
            return (this.mindis < o.mindis) ? -1 : (this.mindis > o.mindis) ? 1 : 0;
        }
    }
}

/*
7 7
1 2 5
1 7 5
3 2 5
1 3 5
3 4 3
6 4 1
4 5 3
1 6

The distance between 1 and 6 is --> 9
The path is 1 -> 3 -> 4 -> 6
--------------------------------------

7 9
1 2 28
1 6 10
2 3 16
2 7 14
6 5 25
7 5 24
7 4 18
5 4 22
3 4 12
1 4

The distance between 1 and 4 is --> 56
The path is 1 -> 2 -> 3 -> 4
--------------------------------------

8 15
1 2 9
2 3 24
1 6 14
1 7 15
6 3 18
6 7 5
6 5 30
5 7 20
3 5 2
5 8 16
7 8 44
5 4 11
4 3 6
4 8 6
3 8 19
1 8

The distance between 1 and 8 is --> 44
The path is 1 -> 6 -> 3 -> 4 -> 8
--------------------------------------

21 41
1 2 2
1 3 4
1 4 1
2 3 3
2 5 1
3 5 2
3 6 2
4 6 5
4 7 4
5 8 3
6 8 3
6 9 2
6 10 4
6 7 3
7 11 2
8 12 8
8 13 1
9 13 3
9 14 2
9 10 3
10 15 3
10 11 6
11 15 4
11 16 2
12 13 6
12 19 6
12 14 2
12 17 2
13 14 3
14 15 5
14 17 2
15 16 1
15 18 2
16 18 8
16 20 5
17 19 2
17 18 1
17 20 1
18 20 3
19 21 2
20 21 8
1 21

The distance between 1 and 21 is --> 16
The path is 1 -> 2 -> 5 -> 8 -> 13 -> 14 -> 17 -> 19 -> 21
----------------------------------------------------------
*/