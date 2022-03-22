package Testing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class EasySum2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(reader.readLine());
        while (tc-- > 0) {
            BigInteger two = new BigInteger("2");

            int n = Integer.parseInt(reader.readLine());
            two = two.pow(n + 1).subtract(BigInteger.ONE);

            writer.write(two.toString().toCharArray());
            writer.newLine();
            writer.flush();
        }
    }
}