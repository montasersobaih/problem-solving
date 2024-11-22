package URI;
//KnapSack

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DestructionCannon {
    public static void main(String[] args) throws Exception {
        StringTokenizer token = null;
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            int ele = Integer.parseInt(b.readLine());
            int[] p = new int[ele + 1];
            int[] w = new int[p.length];

            for (int i = 1; i < p.length; i++) {
                token = new StringTokenizer(b.readLine());
                p[i] = Integer.parseInt(token.nextToken());
                w[i] = Integer.parseInt(token.nextToken());
            }
            int W = Integer.parseInt(b.readLine()),
                    power = Integer.parseInt(b.readLine());

            int max = 0;
            int[][] mat = new int[w.length][W + 1];
            for (int i = 1; i < mat.length; i++) {
                for (int j = 1; j < mat[i].length; j++) {
                    if (w[i] <= j) {
                        mat[i][j] = Math.max(p[i] + mat[i - 1][j - w[i]], mat[i - 1][j]);
                        max = mat[i][j];
                    } else {
                        mat[i][j] = mat[i - 1][j];
                    }
                }
            }
            System.out.println((max >= power) ? "Missao completada com sucesso" : "Falha na missao");
        }
    }
}