package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class GravityFlip {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        b.readLine();
        StringTokenizer str = new StringTokenizer(b.readLine());

        PriorityQueue<Integer> q = new PriorityQueue();

        while (str.hasMoreTokens()) {
            q.offer(Integer.parseInt(str.nextToken()));
        }

        while (!q.isEmpty()) {
            int w = q.poll();
            System.out.print((q.isEmpty()) ? w + "\n" : w + " ");
        }

    }
}
