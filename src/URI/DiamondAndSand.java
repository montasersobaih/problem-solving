package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Stack;

public class DiamondAndSand {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            char[] c = ((b.readLine().replace(".", "")).replace(" ", "")).toCharArray();
            ArrayDeque<Character> q = new ArrayDeque<Character>();
            Stack<Character> s = new Stack<>();
            for (int i = 0; i < c.length; i++) {
                q.offer(c[i]);
            }
            int count = 0;
            while (!q.isEmpty()) {
                if (q.getFirst() == '<') {
                    q.poll();
                    while (!q.isEmpty()) {
                        if (q.getFirst() == '>') {
                            q.poll();
                            count++;
                            while (!s.empty()) {
                                q.addFirst(s.pop());
                            }
                            break;
                        } else {
                            s.push(q.poll());
                        }
                    }
                } else {
                    q.poll();
                }
            }
            System.out.println(count);
        }
    }
}