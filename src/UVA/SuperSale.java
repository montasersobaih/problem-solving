package UVA;

//Knapsack

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class SuperSale {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int tc = parseInt(b.readLine());
        while (tc-- > 0) {
            Weight[] w = new Weight[parseInt(b.readLine()) + 1];
            for (int i = 1; i < w.length; i++) {
                StringTokenizer token = new StringTokenizer(b.readLine());
                w[i] = new Weight(parseInt(token.nextToken()), parseInt(token.nextToken()));
            }

            int sum = 0, person = parseInt(b.readLine());
            while (person-- > 0) {
                int[][] x = new int[w.length][parseInt(b.readLine()) + 1];
                for (int i = 1; i < x.length; i++) {
                    for (int j = 1; j < x[i].length; j++) {
                        if (w[i].getWeight() <= j) {
                            x[i][j] = Math.max(w[i].getPrice() + x[i - 1][j - w[i].getWeight()], x[i - 1][j]);
                        } else {
                            x[i][j] = x[i - 1][j];
                        }
                    }
                }
                sum += x[x.length - 1][x[0].length - 1];
            }

            System.out.println(sum);
        }
    }

    private static class Weight {
        protected int p, w;

        public Weight(int p, int w) {
            this.p = p;
            this.w = w;
        }

        public int getWeight() {
            return this.w;
        }

        public int getPrice() {
            return this.p;
        }
    }
}