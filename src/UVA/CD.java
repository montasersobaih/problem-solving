package UVA;

//Knapsack

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CD {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;

        String line;
        while ((line = reader.readLine()) != null) {
            token = new StringTokenizer(line);
            int W = Integer.parseInt(token.nextToken()) + 1;
            int[] w = new int[Integer.parseInt(token.nextToken()) + 1];
            int[][] a = new int[w.length][W];

            for (int i = 1; i < w.length; i++) {
                w[i] = Integer.parseInt(token.nextToken());
            }

            for (int i = 1; i < a.length; i++) {
                for (int j = 1; j < a[i].length; j++) {
                    if (w[i] <= j) {
                        a[i][j] = Math.max(w[i] + a[i - 1][j - w[i]], a[i - 1][j]);
                    } else {
                        a[i][j] = a[i - 1][j];
                    }
                }
            }

            StringBuilder builder = new StringBuilder();
            for (int i = a.length - 1, j = a[i].length - 1; i >= 1; i--) {
                if (a[i][j] != a[i - 1][j]) {
                    builder.insert(0, w[i]).insert(0, " ");
                    j -= w[i];
                }
            }

            System.out.println(builder.append(" sum:").append(a[a.length - 1][a[0].length - 1]).substring(1));
        }
    }
}