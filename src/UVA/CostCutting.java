package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CostCutting {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= tc; i++) {
            int[] n = new int[3];

            String[] split = reader.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                n[j] = Integer.parseInt(split[j]);
            }

            Arrays.sort(n);
            System.out.printf("Case %d: %d\n", i, n[1]);
        }
    }
}
