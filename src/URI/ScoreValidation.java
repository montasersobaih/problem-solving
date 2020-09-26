package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ScoreValidation {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        double a = 0;
        int c = 0;
        while (c < 2) {
            double x = Double.parseDouble(b.readLine());
            if (x >= 0 && x <= 10) {
                a += x;
                c++;
            } else {
                f.write("nota invalida\n");
            }
        }
        f.write(String.format("media = %.2f\n", a / 2));
        f.flush();
    }
}