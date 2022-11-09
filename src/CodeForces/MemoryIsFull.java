package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://codeforces.com/gym/100676">2015 ACM Arabella Collegiate Programming Contest</a>
 * @algorithm
 * @since 09-11-2022
 */

public class MemoryIsFull {

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            String[] x = b.readLine().split(" ");
            int[] y = {Integer.parseInt(x[0]), Integer.parseInt(x[1]), Integer.parseInt(x[2]), 0, 0};

            PriorityQueue<Integer> q = new PriorityQueue<>();

            StringTokenizer token = new StringTokenizer(b.readLine());
            while (token.hasMoreTokens()) {
                int z = Integer.parseInt(token.nextToken());
                y[3] += z;
                q.offer(z);
            }

            while (!q.isEmpty() && (y[3] + y[1]) > y[0]) {
                y[3] -= q.poll();
                y[4]++;
            }
            System.out.println(y[4]);
        }
    }
}