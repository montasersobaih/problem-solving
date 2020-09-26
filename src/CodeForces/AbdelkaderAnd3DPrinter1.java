package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

import static java.lang.Integer.parseInt;

public class AbdelkaderAnd3DPrinter1 {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String dim[] = b.readLine().split(" ");
        BigInteger x[][] = new BigInteger[parseInt(dim[0])][parseInt(dim[1])];
        BigInteger sum = BigInteger.ZERO, val;
        for (int i = 0; i < x.length; i++) {
            dim = b.readLine().split(" ");
            for (int j = 0; j < dim.length; j++) {
                val = new BigInteger(dim[j]);
                sum = sum.add(val.multiply(new BigInteger("6"))
                        .subtract(val.subtract(BigInteger.ONE).multiply(new BigInteger("2"))));//
                x[i][j] = val;
            }
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (j - 1 >= 0) {
                    sum = sum.subtract(x[i][j].min(x[i][j - 1]));
                }
                if (i - 1 >= 0) {
                    sum = sum.subtract(x[i][j].min(x[i - 1][j]));
                }
                if (j + 1 < x[i].length) {
                    sum = sum.subtract(x[i][j].min(x[i][j + 1]));
                }
                if (i + 1 < x.length) {
                    sum = sum.subtract(x[i][j].min(x[i + 1][j]));
                }
            }
        }
        System.out.println(sum);
    }
}