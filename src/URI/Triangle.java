package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Triangle {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer string = new StringTokenizer(b.readLine());

        double A = Double.parseDouble(string.nextToken()),
                B = Double.parseDouble(string.nextToken()),
                C = Double.parseDouble(string.nextToken());

        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        if ((A + B) > C && (A + C) > B && (B + C) > A) {
            f.write(String.format("Perimetro = %.1f\n", (A + B + C)));
        } else {
            f.write(String.format("Area = %.1f\n", ((A + B) * C) / 2));
        }
        f.flush();
        f.close();
        b.close();
    }
}
