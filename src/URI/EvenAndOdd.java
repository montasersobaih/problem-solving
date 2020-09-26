package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Stack;

public class EvenAndOdd {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Stack<Integer> stack = new Stack<>();
        int loop = Integer.parseInt(b.readLine()), i;
        while (loop-- > 0) {
            queue.offer(Integer.parseInt(b.readLine()));
        }
        while (!queue.isEmpty()) {
            if ((i = queue.poll()) % 2 == 0) {
                System.out.println(i);
            } else {
                stack.push(i);
            }
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}