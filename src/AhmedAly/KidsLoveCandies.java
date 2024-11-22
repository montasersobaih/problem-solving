package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class KidsLoveCandies {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = parseInt(b.readLine()), loop2, n, k, c;
        while (loop-- > 0) {
            String[] x = b.readLine().split(" ");
            loop2 = parseInt(x[0]);
            n = parseInt(x[1]);
            c = 0;

            x = b.readLine().split(" ");
            while (loop2-- > 0) {
                c += (parseInt(x[loop2]) / n);
            }
            System.out.println(c);
        }
    }
}