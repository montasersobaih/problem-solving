package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OddSum {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= tc; i++) {
            int from = Integer.parseInt(reader.readLine());
            int to = Integer.parseInt(reader.readLine());

            int sum = 0;
            while (from <= to) {
                if (from % 2 == 1) {
                    sum += from;
                }

                from++;
            }

            System.out.printf("Case %d: %d\n", i, sum);
        }
    }
}