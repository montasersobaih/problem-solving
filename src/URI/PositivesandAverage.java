package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PositivesandAverage {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        double sum = 0;

        for (int i = 0; i < 3; i++) {
            double r = Double.parseDouble(b.readLine());
            if (r >= 0) {
                count++;
                sum += r;
            }
            r = Double.parseDouble(b.readLine());
            if (r >= 0) {
                count++;
                sum += r;
            }
        }

        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        f.write(String.format("%d valores positivos\n%.1f\n", count, sum / count));
        f.flush();
        f.close();
        b.close();
    }
}