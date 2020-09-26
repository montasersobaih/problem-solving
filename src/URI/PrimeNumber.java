package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine()), prime;
        while (loop-- > 0) {
            prime = Integer.parseInt(b.readLine());
            boolean f = true;
            for (int i = 2; i < prime; i++) {
                if (prime % i == 0) {
                    f = false;
                    break;
                }
            }
            if (f) {
                System.out.format("%d eh primo\n", prime);
            } else {
                System.out.format("%d nao eh primo\n", prime);
            }
        }
    }
}