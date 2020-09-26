package CodeForces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class TimeLimitExceeded {
    public static void main(String[] args) throws Exception {
//        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader b = new BufferedReader(new FileReader("Input"));

        long h = System.currentTimeMillis();

        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            int length = Integer.parseInt(b.readLine());
            int count = 0;
            int[] x = new int[length];

            StringTokenizer token = new StringTokenizer(b.readLine());
            for (int i = 0; i < x.length; i++) {
                x[i] = Integer.parseInt(token.nextToken());
            }

            for (int i = 0; i < x.length; i++) {
                for (int j = (i + 1), k = (x.length - 1); j <= k; j++, k--) {
                    if (Math.abs(x[i] - x[j]) < 32) {
                        count++;
                    }

                    if (Math.abs(x[i] - x[k]) < 32 && j != k) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        System.out.println(System.currentTimeMillis() - h);
    }
}