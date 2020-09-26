package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Private {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tc = parseInt(reader.readLine());
        while (tc-- > 0) {
            StringBuilder builder = new StringBuilder();
            int before = 0, after = 0;

            int c = 0;
            while ((c = reader.read()) != '.') {
                before += Math.min(Math.abs(c - 'a') + 1, (c - 'A') + 1);
                builder.append((char) c);
            }

            builder.append((char) c);
            while ((c = reader.read()) != ' ' && c != '\n') {
                after += Math.min(Math.abs(c - 'a') + 1, (c - 'A') + 1);
                builder.append((char) c);
            }

            if (before != after) {
                System.out.println(builder.toString());
            }
        }
    }
}
