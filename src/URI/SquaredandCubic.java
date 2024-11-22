package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SquaredandCubic {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(b.readLine()), i = 1;
        while (i <= x) {
            if (i <= x) {
                f.write(new StringBuilder().append(i).append(" ")
                        .append((int) Math.pow(i, 2)).append(" ")
                        .append((int) Math.pow(i, 3)).append("\n")
                        .toString());
            }
            i++;
            if (i <= x) {
                f.write(new StringBuilder().append(i).append(" ")
                        .append((int) Math.pow(i, 2)).append(" ")
                        .append((int) Math.pow(i, 3)).append("\n")
                        .toString());
            }
            i++;
        }
        f.flush();
    }
}
