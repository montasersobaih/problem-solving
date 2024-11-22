package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SeveralScoreswithValidation {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        int s = 1;
        while (s != 2) {
            if (s == 1) {
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
                f.write("novo calculo (1-sim 2-nao)\n");
            } else {
                f.write("novo calculo (1-sim 2-nao)\n");
            }
            s = Integer.parseInt(b.readLine());
        }
        f.flush();
    }
}