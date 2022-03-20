package Spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class IsItTreeAnotherSolution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = reader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            int noOfVertices = parseInt(tokenizer.nextToken()), noOfEdges = parseInt(tokenizer.nextToken());

            List<Integer>[] adj = new List[noOfVertices];
            for (int i = 0; i < noOfVertices; i++) {
                adj[i] = new ArrayList<Integer>();
            }

            for (int i = 0; i < noOfEdges; i++) {
                tokenizer = new StringTokenizer(reader.readLine());
                int from = parseInt(tokenizer.nextToken()) - 1, to = parseInt(tokenizer.nextToken()) - 1;
                adj[from].add(to);
            }
            System.out.println(DFS(0, adj, noOfVertices));
        }
    }

    private static String DFS(int start, List<Integer>[] adj, int noOfVertices) {
        HashSet<Integer> visited = new HashSet<Integer>();
        Stack<Integer> stack = new Stack<Integer>();

        int black = 0;
        stack.push(start);
        while (!stack.isEmpty()) {
            int top = stack.pop();

            if (visited.add(top)) {
                black++;
                Iterator<Integer> it = adj[top].iterator();
                while (it.hasNext()) {
                    stack.push(it.next());
                }
            } else {
                break;
            }
        }
        return (stack.isEmpty() && black == noOfVertices) ? "YES" : "NO";
    }
}
