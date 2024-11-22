package CodeForces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Twins {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer string;
        int coins = Integer.parseInt(b.readLine());

        if (coins == 1) {
            f.write("1\n");
        } else if (coins == 2) {
            string = new StringTokenizer(b.readLine());
            int x = Integer.parseInt(string.nextToken()), y = Integer.parseInt(string.nextToken());

            if (x == y) {
                f.write("2\n");
            } else {
                f.write("1\n");
            }
        } else if (coins == 3) {
            f.write("2\n");
        } else {
            string = new StringTokenizer(b.readLine());

            int[] x = new int[coins];
            int length = x.length;
            for (int i = 0; i < length; i++) {
                x[i] = Integer.parseInt(string.nextToken());
            }

            Arrays.parallelSort(x);

            int gate = 1, sum = 0, sum1 = 0, number = 0;
            for (int i = length - 1; gate != 0; i--) {
                sum += x[i];
                number++;

                sum1 = 0;
                for (int j = 0; j < i; j++) {
                    sum1 += x[j];
                }

                if (sum > sum1) {
                    gate = 0;
                }
            }
            f.write(Integer.toString(number));
        }
        f.newLine();
        f.flush();
    }
}