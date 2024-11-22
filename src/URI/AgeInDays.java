package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AgeInDays {
    public static void main(String[] ars) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int days = Integer.parseInt(b.readLine());

        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] x = {0, 0, 0};
        while (days > 0) {
            if (days >= 365) {
                x[0]++;
                days -= 365;
            } else if (days >= 30) {
                x[1]++;
                days -= 30;
            } else {
                x[2]++;
                days--;
            }
        }
        f.write(String.format("%d ano(s)\n" +
                        "%d mes(es)\n" +
                        "%d dia(s)\n",
                x[0],
                x[1],
                x[2]));
        f.flush();
        f.close();
        b.close();
    }
}
