package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SystemofEquations {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String[] s = b.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[] x = {0, 0};
        int i = 0;
        int j = 0;
        int count = 0;
        double sqrt = 0.0;
        String str = null;

        do {
            sqrt = Math.sqrt(n - i);

            if (sqrt == Double.NaN) {
                break;
            }

            j = (int) sqrt + (int) Math.pow(i, 2);
            if (j == m) {
                x[1] = i;
                x[0] = (int) Math.sqrt(n - x[1]);
                if ((Math.pow(x[0], 2) + x[1]) == n && (x[0] + Math.pow(x[1], 2)) == m) {
                    count++;
                }
            }
            i++;
        } while (j <= m);
        System.out.println(count);
    }
}