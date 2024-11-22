package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SequenceofNumbersandSum {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer string = new StringTokenizer(b.readLine());
        int x = Integer.parseInt(string.nextToken());
        int y = Integer.parseInt(string.nextToken());
        int a = Math.min(x, y);
        int c = Math.max(x, y);

        while (a > 0 && c > 0) {
            StringBuilder str = new StringBuilder();
            int sum = 0;
            while (a <= c) {
                sum += a;
                str.append(a).append(" ");
                a++;
            }
            str.append("Sum=").append(sum).append("\n");
            f.write(str.toString());

            string = new StringTokenizer(b.readLine());
            x = Integer.parseInt(string.nextToken());
            y = Integer.parseInt(string.nextToken());
            a = Math.min(x, y);
            c = Math.max(x, y);
        }
        f.flush();
    }
}
