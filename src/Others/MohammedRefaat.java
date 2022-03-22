package Others;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MohammedRefaat {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        int loop = cs.nextInt();
        for (int i = 0; i < loop; i++) {
            int nodes = cs.nextInt(), edges = cs.nextInt();
            LinkedList<Edge>[] graph = new LinkedList[nodes];

            for (int g = 0; g < graph.length; g++) {
                graph[g] = new LinkedList<Edge>();
            }
            for (int e = 0; e < edges; e++) {
                int from = cs.nextInt() - 1, to = cs.nextInt() - 1, cost = cs.nextInt();
                graph[from].add(new Edge(to, cost));
                graph[to].add((new Edge(from, cost)));
            }
            int S = cs.nextInt() - 1, G = cs.nextInt() - 1;
            boolean[] visited = new boolean[nodes];
            int[] lowcost = new int[nodes];

            Arrays.fill(lowcost, Integer.MAX_VALUE);
            PriorityQueue<State> queue = new PriorityQueue<State>();
            queue.offer(new State(S, 0));
            lowcost[S] = 0;

            int outputCost = 0;
            boolean flag = false;
            while (!queue.isEmpty()) {
                State currentState = queue.poll();
                if (currentState.currentNode == G) {
                    outputCost = currentState.currentCost;
                    flag = true;
                    break;
                }
                if (visited[currentState.currentNode]) {
                    continue;
                }
                visited[currentState.currentNode] = true;

                for (Edge edge : graph[currentState.currentNode]) {
                    System.out.println(currentState.currentCost + edge.cost + " < " + lowcost[edge.node]);
                    if (currentState.currentCost + edge.cost < lowcost[edge.node]) {
                        lowcost[edge.node] = edge.cost + currentState.currentCost;
                        queue.offer(new State(edge.node, lowcost[edge.node]));
                    }
                }
            }
            if (flag) {
                System.out.println("Case " + (i + 1) + ": " + outputCost);
            } else {
                System.out.println("Case " + (i + 1) + ": " + -1);
            }
        }
    }


    public static class Edge {

        public int node, cost;

        public Edge(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    public static class State implements Comparable<State> {

        public int currentNode, currentCost;

        public State(int currentNode, int currentCost) {
            this.currentNode = currentNode;
            this.currentCost = currentCost;
        }

        @Override
        public int compareTo(State o) {
            return Integer.compare(this.currentCost, o.currentCost);
        }
    }
}