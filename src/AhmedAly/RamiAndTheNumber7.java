package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RamiAndTheNumber7 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(reader.readLine());
        while (tc-- > 0) {
            long x = Long.parseLong(reader.readLine()), min = Long.MAX_VALUE;
            for (int i = 1; i <= 7; i++) {
                long result = x * i;
                if (result % 7 == 0 && result < min) {
                    min = result;
                }
            }
            System.out.println(min);
        }
    }
}
