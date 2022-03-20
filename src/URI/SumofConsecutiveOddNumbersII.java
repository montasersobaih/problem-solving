package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SumofConsecutiveOddNumbersII {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(b.readLine());
        while (loop > 0) {
            StringTokenizer string = new StringTokenizer(b.readLine());
            int x = Integer.parseInt(string.nextToken()),
                    y = Integer.parseInt(string.nextToken()),
                    z = (Math.min(x, y) % 2 == 0) ? Math.min(x, y) + 1 : Math.min(x, y) + 2,
                    w = Math.max(x, y),
                    sum = 0;

            while (z < w) {
                sum += z;
                z += 2;
            }
            f.write(sum + "\n");
            loop--;
        }
        f.flush();
    }
}