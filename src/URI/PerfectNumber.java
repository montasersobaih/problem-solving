package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PerfectNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(b.readLine());
        for (int i = 0; i < value; i++) {
            int count = 0, val = Integer.parseInt(b.readLine());
            for (int j = 1; j < val; j++) {
                if (val % j == 0) {
                    count += j;
                }
            }
            if (count == val) {
                System.out.println(val + " eh perfeito");
            } else {
                System.out.println(val + " nao eh perfeito");
            }
        }
    }
}