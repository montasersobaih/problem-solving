package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class PrizesPrizesMorePrizes {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int n = parseInt(b.readLine());
        int[] numOfChoc = new int[n];
        StringTokenizer token = new StringTokenizer(b.readLine());
        while (token.hasMoreTokens()) {
            numOfChoc[numOfChoc.length - token.countTokens()] = parseInt(token.nextToken());
        }

        long[] point = new long[5];
        long[] sums = new long[5];
        long pick = 0;
        token = new StringTokenizer(b.readLine());
        while (token.hasMoreTokens()) {
            point[5 - token.countTokens()] = parseInt(token.nextToken());
        }

        for (int i = 0; i < n; i++) {
            pick += numOfChoc[i];
            for (int j = 0; j < point.length; j++) {
                if (pick < point[0]) {
                    break;
                } else if (!(pick >= point[j])) {
                    sums[j - 1] += pick / point[j - 1];
                    pick %= point[j - 1];
                    j = -1;
                } else if (j + 1 == point.length) {
                    sums[j] += pick / point[j];
                    pick %= point[j];
                    j = -1;
                }
            }
        }
        System.out.println(Arrays.toString(sums).replace(",", "").replace("[", "").replace("]", "") + "\n" + pick);
    }
}