package AhmedAly;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import static java.lang.Integer.parseInt;

public class Cashier {
    private static BufferedReader reader;
    private static BufferedWriter writer;

    public static void main(String[] args) throws Exception {
        reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] bills = new long[101];

        int dollar = 0;
        while ((dollar = read()) != 0) {
            bills[dollar]++;
        }

        for (int i = 1; i < 101; i++) {
            if (bills[i] != 0) {
                writer.write(i + " " + bills[i] + "\n");
            }
        }
        writer.flush();
    }

    private static int read() {
        StringBuilder builder = new StringBuilder();
        try {
            int c = 0;
            while ((c = reader.read()) != -1 && c != ' ' && c != '\n') {
                builder.append((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return parseInt(builder.toString());
    }
}
