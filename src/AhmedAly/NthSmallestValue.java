package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NthSmallestValue {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine()), min1, min2, n;
        while (loop-- > 0) {
            StringTokenizer token = new StringTokenizer(b.readLine());
            min1 = min2 = Integer.MAX_VALUE;
            while (token.hasMoreTokens()) {
                n = Integer.parseInt(token.nextToken());
                if (n < min1) {
                    min2 = min1;
                    min1 = n;
                } else if (n < min2) {
                    min2 = n;
                }
            }
            System.out.println(min2);
        }
    }
}