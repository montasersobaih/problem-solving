package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YaroslavAndPermutations {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(b.readLine()), x[] = new int[1001], y = 0, index = 0, max = 0;
        StringTokenizer token = new StringTokenizer(b.readLine());
        while (token.hasMoreTokens()) {
            if (++x[(y = Integer.parseInt(token.nextToken()))] > max) {
                max = x[y];
                index = y;
            }
        }
        System.out.println((x[index] <= (int) Math.ceil(length / 2.0)) ? "YES" : "NO");
    }
}