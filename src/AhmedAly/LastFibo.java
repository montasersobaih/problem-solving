package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class LastFibo {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        BigInteger[] x = new BigInteger[1001];
        int[] s = new int[x.length];
        int num;
        initialize(x, s);

        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            num = Integer.parseInt(b.readLine());
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < s.length; i++) {
                if (s[i] == num) {
                    builder.append(String.format(", F(%d)", (i)));
                }
            }

            if (builder.length() != 0) {
                System.out.printf("The last three digits of %s are [%s]\n", builder.substring(2), num);
            } else {
                System.out.println("These digits seem to be invalid");
            }
        }
    }

    private static void initialize(BigInteger[] x, int[] s) {
        x[0] = BigInteger.ZERO;//
        x[1] = BigInteger.ONE;//
        s[0] = 0;//
        s[1] = 1;//
        for (int i = 2; i < x.length; i++) {
            x[i] = x[i - 1].add(x[i - 2]);
            String str = String.format("%03d", x[i]);//
            s[i] = Integer.parseInt(str.substring(str.length() - 3));//
        }
    }
}