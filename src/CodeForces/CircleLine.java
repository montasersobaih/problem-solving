package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CircleLine {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int station = Integer.parseInt(b.readLine());
        int[] x = new int[station];
        StringTokenizer token = new StringTokenizer(b.readLine());
        for (int i = 0; i < station; i++) {
            x[i] = Integer.parseInt(token.nextToken());
        }
        token = new StringTokenizer(b.readLine());
        int from = Integer.parseInt(token.nextToken()), to = Integer.parseInt(token.nextToken()), sum1 = 0, sum2 = 0;
        int start = from - 1, end = to - 1, endOfStart = start, endOfEnd = end;
        while (start != endOfEnd || end != endOfStart) {
            if (start != endOfEnd) {
                sum1 += x[start];
                start = (start + 1) % station;
            }

            if (end != endOfStart) {
                sum2 += x[end];
                end = (end + 1) % station;
            }
        }
        System.out.println(Math.min(sum1, sum2));
    }
}