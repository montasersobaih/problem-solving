package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AhmedAly {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(b.readLine()), Case = 1;
        while (loop-- > 0) {
            String[] str = b.readLine().split("\\s");
            boolean is = false;
            if (str[1].equals("+")) {
                is = (Integer.parseInt(str[0]) + Integer.parseInt(str[2])) == Integer.parseInt(str[4]);
            } else {
                is = (Integer.parseInt(str[0]) - Integer.parseInt(str[2])) == Integer.parseInt(str[4]);
            }
            System.out.printf("Case %d: %s\n", Case++, (is) ? "YES" : "NO");
        }
    }
}
