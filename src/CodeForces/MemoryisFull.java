package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class MemoryisFull {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader b = new BufferedReader(new FileReader("Input"));

        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            String[] x = b.readLine().split(" ");
            int[] y = {Integer.parseInt(x[0]),
                    Integer.parseInt(x[1]),
                    Integer.parseInt(x[2]), 0, 0};

            PriorityQueue<Integer> q = new PriorityQueue(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    if (o1 < o2) {
                        return 1;
                    } else if (o1 == o2) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            });

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