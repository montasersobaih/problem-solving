package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Multiplesof13 {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(b.readLine()),
                y = Integer.parseInt(b.readLine()),
                a = Math.min(x, y),
                c = Math.max(x, y),
                sum = 0;
        while (a <= c) {
            if (a <= c) {
                if (a % 13 != 0) {
                    sum += a;
                }
                a++;
            }
            if (a <= c) {
                if (a % 13 != 0) {
                    sum += a;
                }
                a++;
            }
        }
        f.write(sum + "\n");
        f.flush();
    }
}