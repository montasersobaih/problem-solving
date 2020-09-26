package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class GTXLevelInfinity {
    public static void main(String[] args) {
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        int n = parseInt(read(data));

        Integer[] ar = new Integer[n];
        for (int i = 0; i < n; i++) {
            ar[i] = parseInt(read(data));
        }

        Arrays.sort(ar);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(ar[i]).append('\n');
        }

        System.out.println(builder);
    }

    private static String read(BufferedReader reader) {
        StringBuilder builder = new StringBuilder();
        try {
            int c = 0;
            while ((c = reader.read()) != ' ' && c != '\n') {
                builder.append((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
}
