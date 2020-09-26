package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PUM {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = 0, y = Integer.parseInt(b.readLine()), z = 0;
        while (x < y) {
            f.write(new StringBuilder().append(++z).append(" ")
                    .append(++z).append(" ")
                    .append(++z).append(" PUM\n")
                    .toString());
            z++;
            x++;
        }
        f.flush();
    }
}
