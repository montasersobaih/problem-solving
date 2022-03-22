package Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

import static java.lang.Integer.parseInt;

public class HammouriAndPaint {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        Cost[] a1 = new Cost[parseInt(b.readLine())], a2 = new Cost[a1.length];
        String[] str = b.readLine().split(" ");
        a1[0] = new Cost(new BigInteger(str[0]), (byte) 0);
        a2[0] = new Cost(new BigInteger(str[1]), (byte) 1);
        for (int i = 1; i < a1.length; i++) {
            str = b.readLine().split(" ");
            Cost x = new Cost(new BigInteger(str[0]), (byte) 0), y = new Cost(new BigInteger(str[1]), (byte) 1);
            if (a1[i - 1].bt != 0) {
                Cost z = (x.big.compareTo(y.big) < 0) ? x : y;
                a1[i] = new Cost(a1[i - 1].big.add(z.big), z.bt);
            } else {
                a1[i] = new Cost(a1[i - 1].big.add(y.big), y.bt);
            }

            if (a2[i - 1].bt != 0) {
                Cost z = (x.big.compareTo(y.big) < 0) ? x : y;
                a2[i] = new Cost(a2[i - 1].big.add(z.big), z.bt);
            } else {
                a2[i] = new Cost(a2[i - 1].big.add(y.big), y.bt);
            }
        }
        System.out.println((a1[a1.length - 1].big.min(a2[a2.length - 1].big)));
    }

    private static class Cost {
        BigInteger big;
        byte bt;

        Cost(BigInteger bg, byte byt) {
            big = bg;
            bt = byt;
        }
    }
}