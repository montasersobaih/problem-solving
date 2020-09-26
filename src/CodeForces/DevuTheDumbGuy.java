package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class DevuTheDumbGuy {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Long> q = new PriorityQueue<>();
        String[] str1 = b.readLine().split(" ");
        int loop = Integer.parseInt(str1[0]), hour = Integer.parseInt(str1[1]);
        long count = 0L;
        str1 = b.readLine().split(" ");
        for (int i = 0; i < str1.length; i++) {
            q.offer(Long.parseLong(str1[i]));
        }
        while (!q.isEmpty()) {
            count += hour * q.poll();
            hour = (hour > 1) ? --hour : hour;
        }
        System.out.println(count);
    }
}