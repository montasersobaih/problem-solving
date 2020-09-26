package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RestofaDivision {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(b.readLine()),
                y = Integer.parseInt(b.readLine()),
                a = Math.min(x, y) + 1,
                c = Math.max(x, y);

        while (a < c) {
            if (a < c) {
                if (a % 5 == 2 || a % 5 == 3) {
                    f.write(a + "\n");
                }
                a++;
            }
            if (a < c) {
                if (a % 5 == 2 || a % 5 == 3) {
                    f.write(a + "\n");
                }
                a++;
            }
        }
        f.flush();
    }
}
