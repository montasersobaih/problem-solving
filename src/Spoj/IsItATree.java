package Spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class IsItATree {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int noOfVertices = parseInt(tokenizer.nextToken()), noOfEdges = parseInt(tokenizer.nextToken());

        List<Integer>[] adj = new List[noOfVertices];
        for (int i = 0; i < noOfVertices; i++) {
            adj[i] = new LinkedList<Integer>();
        }

        while (noOfEdges-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int from = parseInt(tokenizer.nextToken()) - 1, to = parseInt(tokenizer.nextToken()) - 1;
            adj[from].add(to);
        }
        System.out.println(DFS(adj, 0, noOfVertices));
    }

    private static String DFS(List<Integer>[] adj, int start, int vertexnum) {
        boolean[] visited = new boolean[vertexnum];

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(start);

        int black = 0;
        while (!stack.isEmpty()) {
            int top = stack.pop();
            stack.addAll(adj[top]);

            if (!visited[top]) {
                visited[top] = true;
                black++;
            } else {
                break;
            }
        }
        return (stack.isEmpty() && black == vertexnum) ? "YES" : "NO";
    }
}
