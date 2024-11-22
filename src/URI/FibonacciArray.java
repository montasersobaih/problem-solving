package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FibonacciArray {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        long[] fib = initialize(new long[61]);
        long loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            int index = Integer.parseInt(b.readLine());
            System.out.printf("Fib(%d) = %d%n", index, fib[index]);
        }
    }

    private static long[] initialize(long[] fib) {
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
}