package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Initialization {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(b.readLine());

        long x = Integer.parseInt(token.nextToken());
        long y = Integer.parseInt(token.nextToken());


        token = new StringTokenizer(b.readLine());

        StringBuilder builder = new StringBuilder();
        long min = Long.MAX_VALUE;
        for (long i = 1; i <= x; i++) {
            long h = Long.parseLong(token.nextToken());
            if (h < min) {
                min = h;
            }

            if (i % y == 0) {
                builder.append(min).append(" ");
                min = Long.MAX_VALUE;
            } else {
                if (i == x) {
                    builder.append(min).append(" ");
                }
            }
        }
        System.out.println(builder);
    }
}