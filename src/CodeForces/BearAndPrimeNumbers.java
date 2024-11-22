package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BearAndPrimeNumbers {
    private static int[] primes = new int[664579];
    private static boolean[] bool = new boolean[10000000];

    public static void main(String[] args) throws Exception {
        initialize();
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine());
        int[] y = new int[10000001];
        int[] z = new int[10000001];
        StringTokenizer token = new StringTokenizer(b.readLine());
        while (token.hasMoreTokens()) {
            y[Integer.parseInt(token.nextToken())]++;
        }
        for (int n : primes) {
            for (int i = n; i < y.length; i += n) {
                z[n] += y[i];
            }
        }
        for (int i = 1; i < z.length; i++) {
            z[i] += z[i - 1];
        }
        loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            token = new StringTokenizer(b.readLine());
            int low = ((low = Integer.parseInt(token.nextToken())) >= z.length) ? z.length - 1 : low,
                    high = ((high = Integer.parseInt(token.nextToken())) >= z.length) ? z.length - 1 : high;
            System.out.println(z[high] - z[low - 1]);
        }
    }

    private static void initialize() {
        int k = 0;
        for (int i = 2; (i * i) < bool.length; i++) {
            if (!bool[i]) {
                for (int j = (i * i); j < bool.length; j += i) {
                    bool[j] = true;
                }
            }
        }
        for (int i = 2; i < bool.length; i++) {
            if (!bool[i]) {
                primes[k++] = i;
            }
        }
    }
}