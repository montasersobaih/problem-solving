package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Taxes {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(b.readLine()), r = 0.0, tax = 0.0;

        String str = null;
        if (d >= 0.0 && d <= 2000.0) {
            str = "Isento\n";
        } else if (d > 2000.0 && d <= 3000.0) {
            r = d - 2000.0;
            tax = r * 0.08;
            str = String.format("R$ %.2f\n", tax);
        } else if (d > 3000.0 && d <= 4500.0) {
            r = d - 2000.0;
            tax = 1000 * 0.08;
            r -= 1000;
            tax += r * 0.18;
            str = String.format("R$ %.2f\n", tax);
        } else {
            r = d - 2000.0;
            tax = 1000 * 0.08;
            r -= 1000;
            tax += 1500 * 0.18;
            r -= 1500;
            tax += r * 0.28;
            str = String.format("R$ %.2f\n", tax);
        }
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));
        f.write(str);
        f.flush();
    }
}
