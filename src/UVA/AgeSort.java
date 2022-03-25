package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AgeSort {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        while (!b.readLine().equals("0")) {
            int[] x = new int[101];

            StringTokenizer token = new StringTokenizer(b.readLine());
            while (token.hasMoreTokens()) {
                x[Integer.parseInt(token.nextToken())]++;
            }

            StringBuilder builder = new StringBuilder();
            for (int j = 1; j < x.length; j++) {
                for (int k = 0; k < x[j]; k++) {
                    builder.append(j).append(" ");
                }
            }

            System.out.println(builder.toString().trim());
        }
    }
}