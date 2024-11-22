package AhmedAly;

import java.util.Scanner;

public class TheEquation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int loop = s.nextInt();
        for (int i = 1; i <= loop; i++) {
            int[] x = {s.nextInt(), s.nextInt(), s.nextInt()};
            double sum = 1;
            for (int j = 1; j <= x[1]; j++) {
                sum += (((Math.pow(x[0], j)) + j) / (x[2] - j));
            }
            String a = "";
            if (sum % ((int) sum) == 0) {
                a = String.format("Case %d:\n%1.0f", i, sum);
            } else {
                a = String.format("Case %d:\n%1.1f", i, sum);
            }
            System.out.println(a);
        }
    }
}