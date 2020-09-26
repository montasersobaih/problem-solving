package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Stack;

public class ParenthesisBalance1 {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        char[] g = "1234567890abcdefghijklmnopqrstuvwxyz-*/+^".toCharArray();

        String str;
        while ((str = b.readLine()) != null) {
            for (int i = 0; i < g.length; i++) {
                str = str.replace(Character.toString(g[i]), "");
            }
            if (str.length() % 2 == 0) {
                if (paranth(str) >= (str.length() / 2)) {
                    System.out.println("correct");
                } else {
                    System.out.println("incorrect");
                }
            } else {
                System.out.println("incorrect");
            }
        }
    }

    public static int paranth(String str) {
        char[] c = str.toCharArray();
        ArrayDeque<Character> q = new ArrayDeque<>();
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < c.length; i++) {
            q.offer(c[i]);
        }
        int count = 0;
        while (!q.isEmpty()) {
            if (q.getFirst() == '(') {
                q.poll();
                while (!q.isEmpty()) {
                    if (q.getFirst() == ')') {
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
        return count;
    }
}