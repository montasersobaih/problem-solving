package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class AirPlane {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        PriorityQueue<Integer> rpq = new PriorityQueue<Integer>(Collections.reverseOrder());

        tokenizer = new StringTokenizer(reader.readLine());
        int pass = parseInt(tokenizer.nextToken());
        int plane = parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(reader.readLine());
        while (plane-- > 0) {
            int token = parseInt(tokenizer.nextToken());
            pq.offer(token);
            rpq.offer(token);
        }

        int min = 0, max = 0;
        while (pass-- > 0) {
            int set1 = pq.poll(), set2 = rpq.poll();
            min += set1;
            max += set2;

            if (--set1 > 0) {
                pq.offer(set1);
            }

            if (--set2 > 0) {
                rpq.offer(set2);
            }
        }
        System.out.printf("%d %d\n", max, min);
    }
}
