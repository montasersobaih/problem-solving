package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Interval {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        double r = Double.parseDouble(b.readLine());

        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        if (r < 0) {
            f.write("Fora de intervalo\n");
        } else if (r <= 25) {
            f.write("Intervalo [0,25]\n");
        } else if (r <= 50) {
            f.write("Intervalo (25,50]\n");
        } else if (r <= 75) {
            f.write("Intervalo (50,75]\n");
        } else if (r <= 100) {
            f.write("Intervalo (75,100]\n");
        } else {
            f.write("Fora de intervalo\n");
        }
        f.flush();
        f.close();
        b.close();
    }
}
