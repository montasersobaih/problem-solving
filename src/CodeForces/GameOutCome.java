package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class GameOutCome {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int nXn = parseInt(b.readLine());
        int[] row = new int[nXn];
        int[] col = new int[nXn];
        for (int i = 0; i < nXn; i++) {
            String[] str = b.readLine().split(" ");
            for (int j = 0; j < nXn; j++) {
                int num = parseInt(str[j]);
                row[i] += num;
                col[j] += num;
            }
        }

        int count = 0;
        for (int i = 0; i < nXn; i++) {
            for (int j = 0; j < nXn; j++) {
                if (col[j] > row[i]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}